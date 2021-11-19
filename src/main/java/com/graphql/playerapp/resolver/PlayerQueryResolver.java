package com.graphql.playerapp.resolver;


import com.graphql.playerapp.model.Player;
import com.graphql.playerapp.service.PlayerService;
import com.graphql.playerservice.model.Player;
import com.graphql.playerservice.service.PlayerService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PlayerQueryResolver implements GraphQLQueryResolver {

    private final PlayerService playerService;

    public List<Player> allPlayers() {
        return playerService.allPlayers();
    }

}
