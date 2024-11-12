package com.example.Nov12.Practice;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {
	
	protected String 이름;
	
	public Person(String 이름) {
		this.이름 = 이름;
	}

}
