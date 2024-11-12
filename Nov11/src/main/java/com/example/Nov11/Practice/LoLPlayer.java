package com.example.Nov11.Practice;

public class LoLPlayer extends Person implements AutoCloseable {
	
	private String position;
	private int win;
	
	public LoLPlayer(String name, int age, String position, int win) {
		super(name, age);
		this.position = position;
		this.win = win;
	}


	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
