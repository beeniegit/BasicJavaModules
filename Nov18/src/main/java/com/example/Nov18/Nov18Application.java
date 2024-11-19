package com.example.Nov18;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Nov18.Homework.Blood;
import com.example.Nov18.Homework.FootballPosition;
import com.example.Nov18.Homework.LOLPosition;
import com.example.Nov18.Homework.Lck;
import com.example.Nov18.Homework.Person;
import com.example.Nov18.Homework.Premier;

@SpringBootApplication
public class Nov18Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov18Application.class, args);
		practice();
	}
	
	private static void practice() {
		// 프리미어 클래스 기반 리스트 생성 및 데이터 입력
		List<Premier> p = new ArrayList<>();
		p.add(new Premier("강두", 38, Blood.B, 187, 85, FootballPosition.ATT, 900));
		p.add(new Premier("살라", 32, Blood.ETC, 175, 71, FootballPosition.ATT, 357));
		p.add(new Premier("해저드", 33, Blood.ETC, 175, 74, FootballPosition.ATT, 200));
		p.add(new Premier("우리흥", 32, Blood.AB, 183, 78, FootballPosition.ATT, 264));
		// Lck 클래스 기반 리스트 생성 및 데이터 입력
		List<Lck> l = new ArrayList<>();
		l.add(new Lck("Faker", 28, Blood.AB, 177, 56, LOLPosition.MID, 5021));
		l.add(new Lck("Gumayusi", 22, Blood.B, 181, 83, LOLPosition.ADC, 2167));
		l.add(new Lck("Zeus", 20, Blood.A, 177, 5000, LOLPosition.TOP, 1402));
		l.add(new Lck("Oner", 21, Blood.ETC, 178, 69, LOLPosition.JGL, 1492));
		// 리스트 인스턴스 중 25세 이하 데이터를 사람 기반 클래스에 등록
		List<Person> e = new ArrayList<>();
		for (Premier pp : p) {
			if (pp.getAge() <= 25) {
				e.add(pp);
			} else {
				System.out.println("만 25세 이하 선수만 등록 가능합니다.");
			}
		}
		for (Lck ll : l) {
			if (ll.getAge() <= 25) {
				e.add(ll);
			} else {
				System.out.println("만 25세 이하 선수만 등록 가능합니다.");
			}
		}
	}

}
