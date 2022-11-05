package advanced.lessons.javaio.akin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> stringList = List.of("name 1", "name 2", "name 3");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/strings.txt"));

        for (String s : stringList) {
            bufferedWriter.write(s + "\n");
        }

        bufferedWriter.close();

    }

}
