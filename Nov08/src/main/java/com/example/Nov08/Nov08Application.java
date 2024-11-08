package com.example.Nov08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Nov08.Basics.ClassAndProperty;
import com.example.Nov08.Training.Person;

@SpringBootApplication
public class Nov08Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov08Application.class, args);
		
		Person 실험용인턴1 = new Person();
		
		Person 실험용인턴2 = new Person("김도빈", 17);
		
		Person 실험용인턴3 = new Person("김도빈", 17, 170, 53);
		실험용인턴3.setWeight(50);
	}

}
