package com.graphql.playerapp.mappers;

import com.graphql.playerapp.dto.PlayerDTO;
import com.graphql.playerapp.model.Player;
import org.mapstruct.Mapper;

@Mapper
public interface PlayerMapper {

    Player mapFromPlayerDTOtoPlayer(PlayerDTO playerDTO);
}
