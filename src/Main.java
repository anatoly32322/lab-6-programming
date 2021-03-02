import com.Commands;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
//        String path = "C:\Users\User\IdeaProjects\lab_5\src\com\input.csv";
        String path = "C:\\Users\\User\\IdeaProjects\\lab_5\\src\\com\\input.csv";
        Commands cm = new Commands(path);
        cm.input();
    }
}
