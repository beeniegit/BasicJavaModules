package com.example.Nov12;

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
		map.put(7,);
	}

}
