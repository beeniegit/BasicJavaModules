package com.example.Nov14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Nov14.Generics.DataList;
import com.example.Nov14.Generics.Class.Human;
import com.example.Nov14.Generics.Class.Person;
import com.example.Nov14.Payphone.FootballPlayer;
import com.example.Nov14.Payphone.LoLPlayer;
import com.example.Nov14.Payphone.Player;
import com.example.Nov14.Payphone.PlayerList;

@SpringBootApplication
public class Nov14Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov14Application.class, args);
		hoonie_workspace();
//		beenie_workspace();
		workspace();
	}
	
	public static void hoonie_workspace() {
		DataList<Human> listH = new DataList();
		listH.put(new Human("김도훈", 29));
		listH.put(new Human("김도빈", 18));
		listH.printEverything();
		List<Human> lh = listH.getList();
		for (Human h : lh) {
			System.out.println(h.getName());
		}
		
		DataList<Person> listP = new DataList();
		listP.put(new Person("김도훈", 29));
		listP.put(new Person("김도빈", 18));
		listP.printEverything();
	}
	
	public static void workspace() {
		PlayerList<Player> listl = new PlayerList();
		listl.put(new LoLPlayer("김도빈", 17, "탑", 1));
		listl.put(new LoLPlayer("Faker", 28, "미드", 500));
		listl.put(new LoLPlayer("Gumayusi", 23, "원딜", 100));
		listl.put(new FootballPlayer("Son", 32, "좌윙", 50, 50));
		listl.put(new FootballPlayer("강두", 1, "스트", 40, 40));
		listl.put(new FootballPlayer("앙까라메시", 40, "우윙", 100, 80));
		listl.printer();
		List<Player> nn = listl.get리스트();
		for (Player n : nn) {
			System.out.println(n.getName());
		}
			
	}
	
	public static void beenie_workspace() {
		Map<String, List<com.example.Nov14.Homework.FootballPlayer>> map = new HashMap<>();
		List<com.example.Nov14.Homework.FootballPlayer> list = new ArrayList<>();
		list.add(new com.example.Nov14.Homework.FootballPlayer("강두",  23, 22, 1));
		list.add(new com.example.Nov14.Homework.FootballPlayer("우리흥", 32, 15, 10));
		
		map.put("Spurs", list);
		map.put("Arsenal", null);
		
		List<com.example.Nov14.Homework.FootballPlayer> 공차개 = map.get("Spurs");
    	if (공차개 != null) {
            for (com.example.Nov14.Homework.FootballPlayer t : 공차개) {
                System.out.println(t);
            }
    	}
    
	}
	

}
