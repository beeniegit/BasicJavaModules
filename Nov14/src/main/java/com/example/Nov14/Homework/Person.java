package com.example.Nov14.Homework;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {
	
	protected String Name;
	protected int Age;

	public Person(String name, int age) {
		this.Name = name;
		this.Age = age;
	}
}
