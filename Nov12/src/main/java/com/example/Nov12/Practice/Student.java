package com.example.Nov12.Practice;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Student extends Person {
	
	private int 학번;
	private int 상벌점;
	
	/**
	 * 인스턴스를 생성하고, 클래스 내의 모든 속성을 초기화하는 메서드
	 * @param 이름
	 * @param 학번
	 * @param 상벌점
	 */
	public Student(String 이름, int 학번, int 상벌점) {
		super(이름);
		this.학번 = 학번;
		this.상벌점 = 상벌점;
	}
	
	public void 아무개() {
		System.out.println("이름 : " + 이름 + ", 학번 : " + 학번 + ", 상벌점 : " + 상벌점);
	}
	
	@Override
	public String toString() {
		return "이름 : " + 이름 + ", 학번 : " + 학번 + ", 상벌점 : " + 상벌점;
	}

}
