package com.example.Nov15.Homework;

/**
 * 속성을 생성하고 속성을 반환, 조건에 맞게 수정하는 클래스
 */
public class Player {
	
	private String name;
	private int age;
	private Position position;
	private Team team;
	
	/**
	 * 인스턴스를 생성하고, 모든 속성을 초기화하는 메서드
	 * @param name
	 * @param age
	 * @param position
	 * @param team
	 */
	public Player(String name, int age, Position position, Team team) {
		this.name = name;
		checkandSetAge(age);
		this.position = position;
		this.team = team;
	}
	
	/**
	 * name 속성을 반환하는 메서드
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * age 속성을 반환하는 메서드
	 * @return
	 */
	public int age() {
		return age;
	}
	
	/**
	 * position 속성을 반환하는 메서드
	 * @return
	 */
	public Position getPosition() {
		return position;
	}
	
	/**
	 * team 속성을 반환하는 메서드
	 * @return
	 */
	public Team getTeam() {
		return team;
	}
	
	/**
	 * name 을 받아 name 속성을 수정하는 메서드 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * age 를 받아 확인 후 적정 값일 경우 속성 age 에 수정하는 메서드
	 * @param age
	 */
	public void setAge(int age) {
		checkandSetAge(age);
	}
	/**
	 * position 을 받아 position 속성을 수정하는 메서드
	 * @param position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}
	/**
	 * team 을 받아 team 속성을 수정하는 메서드
	 * @param team
	 */
	public void setTeam(Team team) {
		this.team = team;
	}
	/**
	 * age 를 받아 확인 후 적정 값일 경우 속성 age 에 수정하는 메서드
	 * @param age
	 */
	public void checkandSetAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("0 이상 정수를 입력해야 합니다.");
		}
	}

}
