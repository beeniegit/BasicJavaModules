package com.example.Nov16;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Practice.BloodType;
import Practice.Person;
import Practice.Player;
import Practice.HOmework.People;
import Practice.HOmework.Players;

@SpringBootApplication
public class Nov16Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov16Application.class, args);
		
		practice();
		workspace();
	}
	
	private static void practice() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("이상혁", 29, 175, 65, BloodType.O, "LOL"));
		persons.add(new Person("정지훈", 24, 175, 65, BloodType.A, "LOL"));
		persons.add(new Person("김도훈", 49, 175, 65, BloodType.O, "LOL"));
		persons.add(new Person("손흥민", 32, 183, 78, BloodType.AB, "축구"));
		persons.add(new Person("HK", 31, 188, 82, BloodType.B, "축구"));
		
		List<Player> players = new ArrayList<>();
		
		for (Person p : persons) {
			if (p.get취미() == "LOL") {
				
				Player pl = new Player();
				pl.set이름(p.get이름());
				boolean result = pl.set나이(p.get나이());
				
				if (result) {
					players.add(pl);
				}
				
			} else {
				
			}
		}
		
		for (Player l : players) {
			System.out.println(l.get이름());
		}
		
	}
	

	private static void workspace() {
		//
		List<People> pp = new ArrayList<>();
		pp.add(new People("손", 32, 183, 78, "축구"));
		pp.add(new People("두", 38, 188, 85, "축구"));
		pp.add(new People("메", 36, 170, 67, "축구"));
		pp.add(new People("대", 32, 183, 78, "롤"));
		
		List<Players> ppp = new ArrayList<>();
		
		for (People p : pp) {
			if (p.getHobby() == " 축구") {
				Players pppp = new Players();
				pppp.setName(p.getName());
				boolean result = pppp.setAge(p.getAge());
				if (result) {
					ppp.add(pppp);
				}
			} else {
				
			}
			
		}
		for (Players ppppp : ppp) {
			System.out.println(ppppp.getName());
		}
	}

}
