package ConversionToJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.LinkedList;

public class Сonversion {
    public void FlipTextFileToJson(String TextFile, String OutPutTextFile) throws IOException {
        LinkedList<User> newuser = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new FileReader(TextFile));
        File file = new File(TextFile);
        System.out.println("file.exists() = " + file.exists());
        while (reader.ready()) {
            String line = reader.readLine();
            System.out.println(line);
            if (!line.contains("name age")) {
                String[] lineList = line.split("\\s+");
                System.out.println();
                String name = lineList[0];
                int age = Integer.parseInt(lineList[1]);
                newuser.add(new User(name, age));

            }
            System.out.println(newuser);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter(OutPutTextFile);
        gson.toJson(newuser, fileWriter);
        fileWriter.close();

    }
}



