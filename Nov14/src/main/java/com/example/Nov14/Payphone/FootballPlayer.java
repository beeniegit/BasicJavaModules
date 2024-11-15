package com.example.Nov14.Payphone;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FootballPlayer <T> extends Player {
	
	private String position;
	private int goal;
	private int assist;
	
	public FootballPlayer(String name, int age, String position, int goal, int assist) {
		super(name, age);
		this.position = position;
		this.goal = goal;
		this.assist = assist;
	}
	

}
