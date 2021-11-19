package com.graphql.playerapp.model;


import com.graphql.playerapp.model.enumeration.Positions;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Player extends AbstractBaseEntity {

    private String name;
    private String surname;

    @Enumerated(EnumType.STRING)
    private Positions position;


}
