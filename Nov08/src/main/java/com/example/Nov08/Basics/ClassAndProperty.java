package com.example.Nov08.Basics;

public class ClassAndProperty {
	private String name;
	private int age;
	
	/**
	 * 인스턴스를 생성합니다.
	 */
	public ClassAndProperty() {
		
	}
	
	/**
	 * 인스턴스를 생성합니다. name 속성을 초기화합니다.
	 * @param name
	 */
	public ClassAndProperty(String name) {
		this.name = name;
	}
	
	/**
	 * 인스턴스를 생성합니다. age 속성을 초기화합니다.
	 * @param age
	 */
	public ClassAndProperty(int age) {
		this.age = age;
	}
	
	/**
	 * 인스턴스를 생성합니다. name 속성과 age 속성을 초기화합니다.
	 * @param name
	 * @param age
	 */
	public ClassAndProperty(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 인스턴스를 생성합니다. Object 값을 String 변환 후 출력합니다.
	 * @param message
	 */
	public ClassAndProperty(Object message) {
		System.out.println((String) message);
	}

	/**
	 * name 속성의 현재 값을 반환합니다.
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * age 속성의 현재 값을 반환합니다.
	 * @return
	 */
	public int getAge() {
		return this.age;

	}
	
	/**
	 * name 속성의 값을 입력받은 name 값으로 수정합니다.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * age 속성의 값을 입력받은 age 값으로 수정합니다.
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
