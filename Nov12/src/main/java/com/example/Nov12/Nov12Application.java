package com.example.Nov12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Nov12.Practice.Student;

@SpringBootApplication
public class Nov12Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov12Application.class, args);
		practice();
	}
	
	public static void practice() {
		Map<Integer, List<Student>> map = new HashMap<>();
		List<Student> list = new ArrayList<>();
		list.add(new Student("김도빈", 20704, 5));
		list.add(new Student("송성호", 20713, 15));
		
		map.put(7, list);
		map.put(1, null);
		map.put(2, null);
		map.put(3, null);
		map.put(4, null);
		map.put(5, null);
		map.put(6, null);
		
		List<Student> students = map.get(7);
        	if (students != null) {
	            for (Student r : students) {
	            	r.아무개();
	            }
	        }
		
		}
}


