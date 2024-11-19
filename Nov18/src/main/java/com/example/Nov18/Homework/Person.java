package com.example.Nov18.Homework;

public class Person {
	
	protected String name;
	protected int age;
	protected Blood blood;
	protected long height;
	protected long weight;
	
	public Person(String name, int age, Blood blood, long height, long weight) {
		this.name = name;
		this.age = age;
		this.blood = blood;
		this.height = height;
		this.weight = weight;
	}
	/**
	 * 이름을 반환하는 메서드
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * 나이를 반환하는 메서드
	 * @return
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 혈액형을 반환하는 메서드
	 * @return
	 */
	public Blood getBlood() {
		return blood;
	}
	/**
	 * 키를 반환하는 메서드
	 * @return
	 */
	public long getHeight() {
		return height;
	}
	/**
	 * 몸무게를 반환하는 메서드
	 * @return
	 */
	public long getWeight() {
		return weight;
	}

}
