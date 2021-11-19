package com.graphql.playerapp.service;

import com.graphql.playerapp.dto.PlayerDTO;
import com.graphql.playerapp.model.Player;


import java.util.List;
import java.util.Optional;

public interface PlayerServiceImpl {

    Optional<Player> createPlayer(PlayerDTO playerDTO);

    String deletePlayer(Long id);

    Long count();

    List<Player> allPlayers();

}
