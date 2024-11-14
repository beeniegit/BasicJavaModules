package com.example.Nov14.Payphone;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player {
	
	protected String name;
	protected int age;

	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
