package com.example.Nov11.Practice;

public class LoLPlayer extends Person {
	
	private String position;
	private String kda;
	
	public LoLPlayer(String name, int age, String position, String kda) {
		super(name, age);
		this.position = position;
		this.kda = kda;
	}
	
	
}
