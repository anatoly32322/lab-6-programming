package com.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {
        System.out.println("Client is running");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Client client = new Client("localhost", 5458, br);
        client.run();
    }
}
