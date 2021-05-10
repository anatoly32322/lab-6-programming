package com;

import com.Data.Request;

import java.io.BufferedReader;
import java.io.IOException;

public class AuthManager {
    private String username;
    private String password;


    public AuthManager(){}

    public Request authorization(BufferedReader br) {
        try {
            System.out.println("Введите логин.");
            this.username = br.readLine();
            System.out.println("Введите пароль.");
            this.password = br.readLine();
        } catch (IOException e) {
            System.err.println("Нету данных на ввод");
            System.exit(-1);
        }
        return new Request("authorization", username + " " + password);
    }

    @Override

    public String toString(){
        return username + " " + password;
    }
}
