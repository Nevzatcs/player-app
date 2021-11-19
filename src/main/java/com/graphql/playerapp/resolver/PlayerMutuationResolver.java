package com.graphql.playerapp.resolver;


import com.graphql.playerapp.dto.PlayerDTO;
import com.graphql.playerapp.model.Player;
import com.graphql.playerapp.service.PlayerService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PlayerMutuationResolver implements GraphQLMutationResolver {

    private final PlayerService playerService;


    public Optional<Player> createPlayer(PlayerDTO playerDTO){
         return playerService.createPlayer(playerDTO);
    }

    public String deletePlayer(Long id) {
        playerService.deletePlayer(id);
        return "Player with ID: " + id + " deleted!";
    }

}
