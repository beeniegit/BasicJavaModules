package com.example.Nov11.Practice;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
public class Person {
	
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
