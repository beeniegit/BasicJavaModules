package com.example.Nov15.Homework;

public class Player {
	
	private String name;
	private int age;
	private Position position;
	private Team team;
	
	public Player(String name, int age, Position position, Team team) {
		this.name = name;
		checkandSetAge(age);
		this.position = position;
		this.team = team;
	}
	
	public String getName() {
		return name;
	}
	
	public int age() {
		return age;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public Team getTeam() {
		return team;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		checkandSetAge(age);
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public void checkandSetAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("0 이상 정수를 입력해야 합니다.");
		}
	}

}
