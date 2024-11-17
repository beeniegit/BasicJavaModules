package com.example.Nov17;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Nov17.Practice.Line;
import com.example.Nov17.Practice.Line9;
import com.example.Nov17.Practice.Train;

@SpringBootApplication
public class Nov17Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov17Application.class, args);
		workspace();
	}
	
	private static void workspace() {
		//Train 클래스 기반 리스트 생성 및 데이터 입력
		List<Train> t = new ArrayList<>();
		t.add(new Train(Line.Line1, 10, 31, 2021));
		t.add(new Train(Line.Line5, 8, 5, 1994));
		t.add(new Train(Line.Line9, 6, 9, 2023));
		t.add(new Train(Line.Line9, 6, 9, 1500));
		//Line9 클래스 기반 리스트 생성
		List<Line9> l = new ArrayList<>();
		//생산년도를 입력받은 생산년도로 수정하고 생산한지 25년이 지나지 않았을 경우 추가
		for (Train tt : t) {
			if (tt.get노선() == Line.Line9) {
				Line9 ll = new Line9();
				ll.set생산년도(tt.get생산년도());
				
				if (2024 - tt.get생산년도() <= 25) {
					l.add(ll);
				} else {
					System.out.println("열차의 내구연한은 25년입니다.");
				}
			} else {
				
			}
		}
		for (Line9 lll : l) {
			System.out.println(lll.get생산년도());
		}
	}

}
