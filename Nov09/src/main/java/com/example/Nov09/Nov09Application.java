package com.example.Nov09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Nov09.Tutorial.Generic예제2;
import com.example.Nov09.Tutorial.제네릭;

@SpringBootApplication
public class Nov09Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov09Application.class, args);
		
		Generic예제2 g = new Generic예제2();
		
		g.put("이름", "김도훈");
		g.put("나이", 29);
		
		String 이름 = g.get("이름");
		int 나이 = g.get("나이");
		
		System.out.println(이름 + " : " + 나이);
		
	}

}
