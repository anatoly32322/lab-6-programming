import com.Commands;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
//        String path = "C:\Users\User\IdeaProjects\lab_5\src\input.csv";
        String env = "INPUT";
        String path = System.getenv(env);
        System.out.println(path);
        Commands cm = new Commands(path);
        cm.input(path);
    }
}
