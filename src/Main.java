import com.CommandsManager;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(1);
        if (str.equals("1")){
            path = "C:\\Users\\User\\IdeaProjects\\lab_5\\src\\input.csv";
        }
        else {
            String env = "INPUT";
            path = System.getenv(env);
        }
        System.out.println(path);
        CommandsManager cm = new CommandsManager(path);
//        cm.input(path);
    }
}
