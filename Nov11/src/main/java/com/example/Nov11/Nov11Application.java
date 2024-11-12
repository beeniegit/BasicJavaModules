package com.example.Nov11;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Nov11.Practice.FootballPlayer;
import com.example.Nov11.Practice.LoLPlayer;
import com.example.Nov11.Practice.Person;

@SpringBootApplication
public class Nov11Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov11Application.class, args);
		practice();
	}
	
	public static void practice() {
		
		List<Person> list = new ArrayList<>();
		
		list.add(new LoLPlayer("Faker", 28, "MID", 30));
		list.add(new LoLPlayer("Chovy", 23, "MID", 5));
		list.add(new LoLPlayer("ShowMaker", 24, "MID", 4));
		list.add(new FootballPlayer("Son", 32, 183, 78, 343));
		list.add(new FootballPlayer("Ronaldo", 39, 187, 85, 898));
		list.add(new FootballPlayer("Messi", 37, 170, 67, 850));
		
		for(Person p : list) {
			System.out.println(p.getName());
			System.out.println(p.getName());
		}
	}

}
