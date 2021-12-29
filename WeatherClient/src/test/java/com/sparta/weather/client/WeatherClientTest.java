package com.sparta.weather.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.weather.client.entities.OpenWeather;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.*;

public class WeatherClientTest {
    @Test
    public void getBirminghamWeather(){
        ObjectMapper objectMapper = new ObjectMapper();
        OpenWeather weather;
        try {
            weather = objectMapper.readValue(new URL("http://api.openweathermap.org/data/2.5/weather?q=Birmingham,UK" +
                    "&appid=9bfba80c31ae00e08c7ae93fd5075d52"), OpenWeather.class);
            assertEquals("Birmingham", weather.getName());
            assertEquals(weather.getCoord().getLat(), 52.4814, 0.001);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getBirminghamHttpClientVersion(){
        HttpRequest httpRequest = HttpRequest.newBuilder()
                                             .uri(URI.create("http://api.openweathermap.org/data/2.5/weather?q=Birmingham,UK" +
                                                             "&appid=9bfba80c31ae00e08c7ae93fd5075d52"))
                                             .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            assertEquals(httpResponse.statusCode(), 200);
            HttpHeaders httpHeaders = httpResponse.headers();
            String contentType = httpHeaders.firstValue("content-type").get();
            assertEquals(contentType, "application/json; charset=utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String json = httpResponse.body();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            OpenWeather openWeather = objectMapper.readValue(json, OpenWeather.class);
            assertEquals("Birmingham", openWeather.getName());
            assertEquals(openWeather.getCoord().getLat(), 52.4814, 0.001);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}


/*

        HttpRequest httpRequest = HttpRequest.newBuilder()
                                             .uri(URI.create("http://api.openweathermap.org/data/2.5/weather?q=Birmingham,UK" +
                                                             "&appid=9bfba80c31ae00e08c7ae93fd5075d52"))
                                             .POST(HttpRequest.BodyPublishers.ofString("string body here"))
                                             .build();
 */