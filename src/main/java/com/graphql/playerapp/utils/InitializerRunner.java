package com.graphql.playerapp.utils;

import com.graphql.playerservice.model.Player;
import com.graphql.playerservice.model.enumeration.Positions;
import com.graphql.playerservice.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor

public class InitializerRunner implements CommandLineRunner {


    private final PlayerRepository playerRepository;

    @Override
    public void run(String... args) throws Exception {
        //To delete all infos in db
        playerRepository.deleteAll();

        playerRepository.save(Player.builder().name("Lebron").surname("James").position(Positions.SG).build());
        playerRepository.save(Player.builder().name("Cedi").surname("Osman").position(Positions.PF).build());


    }
}
