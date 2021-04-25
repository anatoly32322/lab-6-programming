package com.Commands;

import com.CollectionManager;
import com.Data.Route;

public class CountByDistance {
    CollectionManager collectionManager = new CollectionManager();

    public CountByDistance(){}

    public void execute(long dist){
        int count = 0;
        for (Route i : collectionManager.getData()) {
            if (i.getDistance() == dist) {
                count++;
            }
        }
        System.out.println("Всего " + count + " объектов с полем Distance равным " + dist + '\n');
    }
}
