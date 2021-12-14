package com.sparta.httpexample;

import java.io.IOException;

public class HttpDriver {
    public static void main(String[] args) throws IOException, InterruptedException {
        String response = HttpProcessor.getBody("https://api.chucknorris.io/jokes/random");
        System.out.println(response);
    }
}
