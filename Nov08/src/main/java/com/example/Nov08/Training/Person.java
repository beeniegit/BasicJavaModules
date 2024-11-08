package com.example.Nov08.Training;

public class Person {
	
	private String 이름;
	private int 나이;
	private double 키;
	private double 무게;
	/**
	 * 인스턴스를 생성하고 "아무것도 받지 않았습니다." 를 출력하는 메서드
	 */
	public Person() {
		System.out.println("아무것도 받지 않았습니다.");
	}
	/**
	 * 인스턴스를 생성하고 '이름', '나이' 속성을 초기화하며, "이름, 나이를 받았습니다." 를 출력하는 메서드
	 * @param 이름
	 * @param 나이
	 */
	public Person(String 이름, int 나이) {
		this.이름 = 이름;
		this.나이 = 나이;
		System.out.println("이름, 나이를 받았습니다.");
	}
	/**
	 * 인스턴스를 생성하고, '이름', '나이', '키', '무게' 속성을 초기화하며, "모든 속성을 받았습니다." 를 출력하는 메서드
	 * @param 이름
	 * @param 나이
	 * @param 키
	 * @param 몸무게
	 */
	public Person(String 이름, int 나이, double 키, double 몸무게) {
		this.이름 = 이름;
		this.나이 = 나이;
		this.키 = 키;
		this.무게 = 몸무게;
		System.out.println("모든 속성을 입력 받았습니다.");
	}
	/**
	 * '이름' 속성을 반환하는 메서드
	 * @return
	 */
	public String getName() {
		return 이름;
	}
	/**
	 * '나이' 속성을 반환하는 메서드
	 * @return
	 */
	public int getAge() {
		return 나이;
	}
	/**
	 * '키' 속성을 반환하는 메서드
	 * @return
	 */
	public double getHeight() {
		return 키;
	}
	/**
	 * '무게' 속성을 반환하는 메서드
	 * @return
	 */
	public double getWeight() {
		return 무게;
	}
	/**
	 * '무게' 속성을 '몸무게' 값으로 수정하고, 수정된 값이 더 낮으면 "아싸 다이어트" 를, 그 외에는 "망했네.." 를 출력하는 메서드
	 * @param 몸무게
	 */
	public void setWeight(double 몸무게) {
		if (몸무게 < 무게) {
			System.out.println("아싸 다이어트");
		} else {
			System.out.println("망했네..");
		}
		this.무게 = 몸무게;
	}

}
