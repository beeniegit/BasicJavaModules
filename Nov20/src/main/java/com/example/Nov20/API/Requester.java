package com.example.Nov20.API;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Requester {
	
	/**
	 * 
	 * @param parameter
	 */
    public static void voidApi(String parameter) {
    	String url = "https://v3.football.api-sports.io/" + parameter;
        String filePath = "C:\\Users\\HP\\Desktop\\API FOOTBALL Key.txt";
        String apiKey = "XxXxXxXxXxXxXxXxXxXxXxXx";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        	apiKey = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("x-rapidapi-host", "v3.football.api-sports.io")
                    .header("x-rapidapi-key", apiKey)
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     * @param parameter
     * @return
     */
    public static String stringApi(String parameter) {
    	String url = "https://v3.football.api-sports.io/" + parameter;
        String filePath = "C:\\Users\\HP\\Desktop\\API FOOTBALL Key.txt";
        String apiKey = "XxXxXxXxXxXxXxXxXxXxXxXx";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        	apiKey = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("x-rapidapi-host", "v3.football.api-sports.io")
                    .header("x-rapidapi-key", apiKey)
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * 
     * @param parameter
     * @param outputFilePath
     */
    public static void voidJsonApi(String parameter, String outputFilePath) {
        String jsonStr = stringApi(parameter);

        // 데이터가 UTF-8 인코딩으로 제공된다고 가정하고 처리
        byte[] utf8Bytes = jsonStr.getBytes(StandardCharsets.UTF_8); 
        String utf8JsonStr = new String(utf8Bytes, StandardCharsets.UTF_8); // UTF-8로 변환
        
        String folder = "C:\\Users\\HP\\git\\BasicJavaModules\\Nov20\\src\\main\\resources\\JsonFiles\\";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Object json = gson.fromJson(utf8JsonStr, Object.class);
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(folder + outputFilePath), StandardCharsets.UTF_8))) { // UTF-8로 파일 쓰기
            writer.write(gson.toJson(json));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}

