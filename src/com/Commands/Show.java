package com.Commands;

import com.Data.Route;

import java.util.ArrayDeque;

public class Show {
    public Show() {}

    public String execute(ArrayDeque<? extends Route> a){
        String text = "";
        ShowRoute showRoute = new ShowRoute();
        for (Route i : a) {
            text += showRoute.execute(i);
        }
        return text;
    }
}
