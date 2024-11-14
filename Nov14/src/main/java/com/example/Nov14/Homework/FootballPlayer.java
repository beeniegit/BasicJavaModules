package com.example.Nov14.Homework;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FootballPlayer extends Person {
	
	private int Goal;
	private int Assist;
	
	public FootballPlayer(String name, int age, int goal, int assist) {
		super(name, age);
		this.Goal = goal;
		this.Assist = assist;
	}
	
	@Override
	public String toString() {
		return "이름 : " + Name + ", 나이 : " + Age + ", 득점 : " + Goal + ", 도움 : " + Assist;
	}

}
