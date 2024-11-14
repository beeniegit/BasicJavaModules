package com.example.Nov12.Practice;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {
	
	protected String 이름;
	
	/**
	 * 인스턴스를 생성하고, 이름 속성을 초기화하는 메서드
	 * @param 이름
	 */
	public Person(String 이름) {
		this.이름 = 이름;
	}

}
