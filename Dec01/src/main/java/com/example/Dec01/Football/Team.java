package com.example.Dec01.Football;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Team {

    private Integer id;
    private Integer leagueId;
    private String name;
    private String country;
    private String founded;

    public Team(Integer id, Integer leagueId, String name, String country, String founded) {
        this.id = id;
        this.leagueId = leagueId;
        this.name = name;
        this.country = country;
        this.founded = founded;
    }

}
