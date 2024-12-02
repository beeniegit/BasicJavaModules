package com.example.Dec01.Football;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class League {

    private int id;
    private String name;
    private String country;

    public League(int id, String name, String country) {
        this.country = country;
        this.id = id;
        this.name = name;
    }

}
