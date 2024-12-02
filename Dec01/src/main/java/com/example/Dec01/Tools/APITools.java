package com.example.Dec01.Tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class APITools {

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
    
        String folder = "C:\\Users\\HP\\git\\BasicJavaModules\\Dec01\\src\\main\\resources\\JsonFiles\\";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Object json = gson.fromJson(jsonStr, Object.class);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(folder + outputFilePath))) {
            writer.write(gson.toJson(json));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
