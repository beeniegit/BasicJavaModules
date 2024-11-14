package com.example.Nov14.Payphone;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoLPlayer <T> extends Player {
	
	private String position;
	private int kda;
	
	public LoLPlayer(String name, int age, String position, int kda) {
		super(name, age);
		this.position = position;
		this.kda = kda;
	}
	

	

}
