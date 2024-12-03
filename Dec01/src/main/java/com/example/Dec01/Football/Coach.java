package com.example.Dec01.Football;

import lombok.Getter;
import lombok.Setter;

public class Coach {
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private Integer teamId;
    @Getter @Setter
    private String name;
    private Integer age;
    @Getter @Setter
    private String country;

    public Coach(Integer id, Integer teamId, String name, Integer age, String country) {
        this.id = id;
        this.teamId = teamId;
        this.name = name;
        this.age = defineAge(age);
        this.country = country;

    }

    public Integer getAge() {
        return age;
    }

    public void setAge() {
        this.age = defineAge(age);
    }

    public Integer defineAge(Integer age) {
        return (3 <= age && age <= 100) ? age : null;
    }

}
