package com.Commands;

import com.Data.Route;

import java.time.ZonedDateTime;
import java.util.ArrayDeque;

public class Info {
    public Info() {}

    public void execute(ArrayDeque<? extends Route> a, ZonedDateTime date, String data){
        Class cl = a.getClass();
        System.out.println("Название контейнера: " + cl.getName());
        System.out.println("Время создания: " + date);
        System.out.println("Данные хранимые в контейнере:\n" + data);
    }
}
