package com.example.Nov19;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Nov19.Homework.Product;
import com.example.Nov19.Homework.Type;

@SpringBootApplication
public class Nov19Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov19Application.class, args);
		practice();
	}
	
	private static void practice() {
		List<Product> p = new ArrayList<>();
		p.add(new Product(241023, "나이키", Type.의류));
		p.add(new Product(241101, "아이맥", Type.가전류));
		p.add(new Product(210311, "에이스침대", Type.가구류));
		p.add(new Product(130826, "이케아책상", Type.가구류));
		p.add(new Product(221225, "템퍼매트리스", Type.가구류));
	}

}
