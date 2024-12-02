package com.example.Dec01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Dec01.Tools.APITools;

@SpringBootApplication
public class Dec01Application {

	public static void main(String[] args) {
		SpringApplication.run(Dec01Application.class, args);
		workspace();
	}

	private static void workspace() {
		String parameter = "league?season=2024";
		String outputFilePath = "24leagues.json";
		// APITools.voidJsonApi(parameter, outputFilePath);
	}

}
