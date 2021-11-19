package com.graphql.playerapp.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class PlayerDTO {

    @NotBlank
    @Pattern(regexp = "^[a-zA-ZöçşığüÖÇŞİĞÜ ,]+(\\s{0,1}[a-zA-ZöçşığüÖÇŞİĞÜ,])*$", message = "Cannot contain special characters or numbers !")
    private String name;

    @NotBlank
    @Pattern(regexp = "^[a-zA-ZöçşığüÖÇŞİĞÜ ,]+(\\s{0,1}[a-zA-ZöçşığüÖÇŞİĞÜ,])*$", message = "Cannot contain special characters or numbers !")
    private String surname;



    @NotBlank(message = "Position of player can be : PG or SG or SF or PF or CF only ")
    @Pattern(regexp = "^[a-zA-ZöçşığüÖÇŞİĞÜ ,]+(\\s{0,1}[a-zA-ZöçşığüÖÇŞİĞÜ,])*$", message = "Cannot contain special characters or numbers and can be : PG or SG or SF or PF or CF only !")
    private String position;
}
