package com.example.Dec01.Football;

import lombok.Getter;
import lombok.Setter;

public class Career {
    @Getter @Setter
    private Integer playerId;
    @Getter @Setter
    private Integer teamId;
    private Integer season;

    public Career(Integer playerId, Integer teamId, Integer season) {
        this.playerId = playerId;
        this.teamId = teamId;
        this.season = defineSeason(season);
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = defineSeason(season);
    }

    public Integer defineSeason(Integer season) {
        return (1800 < season && season <= 2025) ? season : null;
    }

}