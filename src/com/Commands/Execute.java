package com.Commands;

import com.AuxiliaryCommands.GetRoute;
import com.AuxiliaryCommands.GetRouteScript;
import com.CollectionManager;
import com.Data.Request;
import com.Data.Route;
import com.Exceptions.IllegalCommandException;
import com.Exceptions.WrongInputException;

import java.io.*;
import java.util.Scanner;

public class Execute {
    public Execute(boolean isFromFile, BufferedReader bufferedReader){
        execute(isFromFile, bufferedReader);
    }

    public static Request execute(boolean isFromFile, BufferedReader br){
        String path = "";
        String line = "";
        Show show = new Show();
        String[] fields = new String[]{"name", "coordinates", "from", "to"};
        //GetRouteScript getRouteScript = new GetRouteScript();
        Route rt = new Route();
        CollectionManager collectionManager = new CollectionManager();
        while(true) {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                while ((line = br.readLine()) != null) {
                    line.replaceAll("\n", "");
                    line.trim();
                    String[] ln = line.split(" ");
                    switch (ln[0]) {
                        case "help":
                            if (ln.length == 1) {
                                return new Request("help", "");
                            } else {
                                throw new IllegalCommandException("Unknown help_<...> command");
                            }

                        case "info":
                            if (ln.length == 1) {
                                return new Request("info", "");
                            } else {
                                throw new IllegalCommandException("Unknown info_<...> command");
                            }

                        case "show":
                            if (ln.length == 1) {
                                return new Request("show", "");
                            } else {
                                throw new IllegalCommandException("Unknown show_<...> command");
                            }
                        case "add":
                            if (ln.length == 1){
                                GetRoute getRoute = new GetRoute();
                                Route route = getRoute.execute(br);
                                return new Request("add", "", route);
                            } else {
                                throw new IllegalCommandException("Unknown show_<...> command");
                            }

                        case "update":
                            if (ln.length == 2){
                                GetRoute getRoute = new GetRoute();
                                Route route = getRoute.execute(br);
                                return new Request("update", ln[1], route);
                            } else {
                                throw new IllegalCommandException("Unknown show_<...> command");
                            }
                        case "remove_by_id":
                            if (ln.length == 2){
                                return new Request("remove_by_id", ln[1]);
                            } else {
                                throw new IllegalCommandException("Unknown show_<...> command");
                            }
                        case "clear":
                            if (ln.length == 1){
                                return new Request("clear", "");
                            } else {
                                throw new IllegalCommandException("Unknown show_<...> command");
                            }
                        case "exit":
                            if (ln.length == 1){
                                Exit exit = new Exit();
                                exit.execute();
                            } else {
                                throw new IllegalCommandException("Unknown show_<...> command");
                            }
                        case "add_if_max":
                            if (ln.length == 1){
                                Route route = new GetRoute().execute(br);
                                return new Request("add_if_max", "", route);
                            } else {
                                throw new IllegalCommandException("Unknown show_<...> command");
                            }
                        case "add_if_min":
                            if (ln.length == 1){
                                Route route = new GetRoute().execute(br);
                                return new Request("add_if_min", "", route);
                            } else {
                                throw new IllegalCommandException("Unknown show_<...> command");
                            }
                        case "remove_lower":
                            if (ln.length == 1){
                                Route route = new GetRoute().execute(br);
                                return new Request(ln[0], "", route);
                            } else {
                                throw new IllegalCommandException("Unknown show_<...> command");
                            }
                        case "min_by_id":
                            if (ln.length == 1){
                                return new Request(ln[0], "");
                            } else {
                                throw new IllegalCommandException("Unknown show_<...> command");
                            }
                        case "group_counting_by_distance":
                            if (ln.length == 1){
                                return new Request(ln[0], "");
                            } else {
                                throw new IllegalCommandException("Unknown show_<...> command");
                            }
                        case "count_by_distance":
                            if (ln.length == 2){
                                return new Request(ln[0], ln[1]);
                            } else {
                                throw new IllegalCommandException("Unknown show_<...> command");
                            }
                        case "execute_script":
                            ExecuteScript executeScript = new ExecuteScript();
                            executeScript.execute(br, ln[1]);
                            break;
                        default:
                            throw new WrongInputException("Введена неверная команда.");
                    }
                }
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден. Повторите ввод.");
                continue;
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
            } catch (WrongInputException e){
                System.err.println("Введена неверная команда");
            }
        }
        return new Request("exit", "");
    }
}
