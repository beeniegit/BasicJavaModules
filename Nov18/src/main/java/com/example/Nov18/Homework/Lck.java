package com.example.Nov18.Homework;

public class Lck extends Person {
	
	private LOLPosition position;
	private int kill;
	
	public Lck(String name, int age, Blood blood, long height, long weight, LOLPosition position, int kill) {
		super(name, age, blood, height, weight);
		this.position = position;
		this.kill = kill;
	}
	/**
	 * 포지션을 반환하는 메서드
	 * @return
	 */
	public LOLPosition getPositon() {
		return position;
	}
	/**
	 * 킬을 반환하는 메서드
	 * @return
	 */
	public int getKill() {
		return kill;
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
	public void setPosition(LOLPosition position) {
		this.position = position;
	}
	/**
	 * 킬을 받아 속성을 수정하는 메서드
	 * @param kill
	 */
	public void setKill(int kill) {
		this.kill = kill;
	}

}
