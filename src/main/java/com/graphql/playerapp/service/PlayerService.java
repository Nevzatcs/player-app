package com.graphql.playerapp.service;

import com.graphql.playerapp.dto.PlayerDTO;
import com.graphql.playerapp.mappers.PlayerMapper;
import com.graphql.playerapp.model.Player;
import com.graphql.playerapp.repository.PlayerRepository;
import com.graphql.playerapp.utils.ErrorMessageConstants;
import graphql.GraphQLException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Validated
public class PlayerService implements PlayerServiceImpl{

    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    @Override
    public Optional<Player> createPlayer(@Valid PlayerDTO playerDTO){
        Player player = playerMapper.mapFromPlayerDTOtoPlayer(playerDTO);
        if(count() < 12) {
            return Optional.of(playerRepository.save(player));
        }else{
            throw new GraphQLException(ErrorMessageConstants.NUMBER_LIMIT);
        }
    }

    @Override
    public String deletePlayer(Long id) {
        Optional<Player> player = playerRepository.findById(id);
        boolean isExistId = playerRepository.existsById(id);
        if(!isExistId){
            throw new GraphQLException(ErrorMessageConstants.ID_NOT_FOUND + id);
        }
        playerRepository.deleteById(id);
        return "Player with ID: " + id + " deleted!";
    }
    @Override
    public Long count(){
        return playerRepository.count();
    }
    @Override
    public List<Player> allPlayers() {
        return playerRepository.findAll();
    }
}
