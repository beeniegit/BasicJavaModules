package com.example.Nov20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Nov20.API.Requester;

@SpringBootApplication
public class Nov20Application {

	public static void main(String[] args) {
		SpringApplication.run(Nov20Application.class, args);
		
		test();
		nov24();
		nov26();
	}
	
	private static void test() {
		
	}
	
	private static void nov24() {
		String parameter = "teams?leauge=31$season=2021";
		
		//Requester.voidApi(parameter);
	}
	
	private static void nov26() {
		String parameter = "teams?id=48";
		Requester.voidApi(parameter);
		Requester.voidJsonApi(parameter, "teams48.json");
	}

}
