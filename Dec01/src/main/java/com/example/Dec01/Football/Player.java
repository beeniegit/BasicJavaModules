package com.example.Dec01.Football;

import lombok.Getter;
import lombok.Setter;

public class Player {
    
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private Integer teamid;
    @Getter @Setter
    private String name;
    private Integer age;
    private long height;
    private long weight;
    @Getter @Setter
    private String country;
    private Integer goal;
    private Integer assist;
    
    public Player(Integer id, Integer teamid, String name, Integer age, long height, long weight, String country, Integer goal, Integer assist) {
        this.id = id;
        this.teamid = teamid;
        this.name = name;
        this.age = defineAge(age);
        this.height = defineHeight(height);
        this.weight = defineWeight(weight);
        this.country = country;
        this.goal = defineGoal(goal);
        this.assist = defineAssist(assist);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = defineAge(age);
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = defineHeight(height);
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = defineWeight(weight);
    }

    public Integer getGoal() {
        return goal;
    }

    public void setGoal(Integer goal) {
        this.goal = defineGoal(goal);
    }

    public Integer getAssist() {
        return assist;
    }

    public void setAssist(Integer assist) {
        this.assist = defineAssist(assist);
    }

    public Integer defineAge(Integer age) {
        return (0 <= age && age <= 100) ? age : null;
    }

    public long defineHeight(long height) {
        return (100 < height && height < 300) ? height : null;
    }

    public long defineWeight(long weight) {
        return (40 < weight && weight < 150) ? weight : null;
    }

    public Integer defineGoal(Integer goal) {
        return (0 <= goal) ? goal : null;
    }

    public Integer defineAssist(Integer assist) {
        return (0 <= assist) ? assist : null;
    }

}
