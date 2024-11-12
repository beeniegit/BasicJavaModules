package com.example.Nov12.Practice;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Student extends Person {
	
	private int 학번;
	private int 상벌점;
	
	public Student(String 이름, int 학번, int 상벌점) {
		super(이름);
		this.학번 = 학번;
		this.상벌점 = 상벌점;
	}

}
