package com.example.Nov18.Homework;

public class Premier extends Person {
	
	private FootballPosition position;
	private int goal;
	
	public Premier(String name, int age, Blood blood, long height, long weight, FootballPosition position, int goal) {
		super(name, age, blood, height, weight);
		this.position = position;
		this.goal = goal;
	}
	/**
	 * 포지션 속성을 반환하는 메서드
	 * @return
	 */
	public FootballPosition getPosition() {
		return position;
	}
	/**
	 * 골 속성을 반환하는 메서드
	 * @return
	 */
	public int getGoal() {
		return goal;
	}
	/**
	 * 이름을 받아 속성을 수정하는 메서드
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 나이를 받아 속성을 수정하는 메서드
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 혈액형을 받아 속성을 수정하는 메서드
	 * @param blood
	 */
	public void setBlood(Blood blood) {
		this.blood = blood;
	}
	/**
	 * 키를 받아 수정하는 메서드
	 * @param height
	 */
	public void setHeight(long height) {
		this.height = height;
	}
	/**
	 * 몸무게를 받아 수정하는 메서드
	 * @param weight
	 */
	public void setWeight(long weight) {
		this.weight = weight;
	}
	/**
	 * 포지션을 받아 속성을 수정하는 메서드
	 * @param position
	 */
	public void setPosition(FootballPosition position) {
		this.position = position;
	}
	/**
	 * 골을 받아 속성을 수정하는 메서드
	 * @param goal
	 */
	public void setGoal(int goal) {
		this.goal = goal;
	}
	
	

}
