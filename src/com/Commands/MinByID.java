package com.Commands;

import com.CollectionManager;
import com.Data.Route;

public class MinByID {
    CollectionManager collectionManager = new CollectionManager();
    public MinByID(){}

    public void execute(){
        int min_id = collectionManager.getData().getFirst().getId();
        Route min_by_id = collectionManager.getData().getFirst();
        for (Route i : collectionManager.getData()) {
            if (min_id > i.getId()) {
                min_id = i.getId();
                min_by_id = i;
            }
        }
        ShowRoute showRoute = new ShowRoute();
        System.out.println(showRoute.execute(min_by_id));
    }
}
