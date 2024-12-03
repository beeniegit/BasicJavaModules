package com.example.Dec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Dec01.Football.*;
import com.example.Dec01.Tools.APITools;

@SpringBootApplication
public class Dec01Application {

	public static void main(String[] args) {
		SpringApplication.run(Dec01Application.class, args);
		workspace();
	}

	/**
	 * 
	 */
	private static void workspace() {
		List<League> ll = new ArrayList<>();
		ll.add(new League(100, "PL", "ENG"));
		ll.add(new League(200, "PLL", "ENG"));
		
		Map<String, League> lm = new HashMap<>();
		lm.put("라리가", new League(300, "LaLiga", "ESP"));
		lm.put("짭리가", new League(400, "Lalala", "ESP"));
		System.out.println(lm.get("짭리가"));

		List<Team> tl = new ArrayList<>();
		tl.add(new Team(10, 100, "똥트넘", "ENG", "2021-99-99"));
		tl.add(new Team(12, 300, "황족레알", "ESP", "1000-12-15"));

		Map<String, Team> tm = new HashMap<>();
		tm.put("황트넘", new Team(10, 100, "똥트넘", "ENG", "2021-99-99"));
		tm.put("응애레알", new Team(12, 300, "황족레알", "ESP", "1000-12-15"));
		System.out.println(tm.get("황트넘"));

		List<Player> pl = new ArrayList<>();
		pl.add(new Player(1, 1032, "강두", 56, 160, 140, "POR", 6000, 1));
		pl.add(new Player(111, 1212, "앙까라", 43, 200, 60, "ARG", 5000, 4000));

		Map<String, Player> pm = new HashMap<>();
		pm.put("우리형", new Player(1, 1032, "강두", 56, 160, 140, "POR", 6000, 1));
		pm.put("메ㅈ", new Player(111, 1212, "앙까라", 43, 200, 60, "ARG", 5000, 4000));
		System.out.println(pm.get("우리형"));

		List<Coach> cl = new ArrayList<>();
		cl.add(new Coach(30, 3223, "꼰대시발아", 70, "ITA"));
		cl.add(new Coach(24, 421, "물이뉴", 65, "POR"));

		Map<String, Coach> cm = new HashMap<>();
		cm.put("콘테", new Coach(30, 3223, "꼰대시발아", 70, "ITA"));
		cm.put("무리뉴", new Coach(24, 421, "물이뉴", 65, "POR"));
		System.out.println(cm.get("콘테"));
	}

}
