package advanced.exercise.IO.Task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String lineToAdd = bufferedReader.readLine() + "\n";
        bufferedReader.close();

        Path path = Paths.get("src/IO/Task03/data_add.txt");
        Files.write(path, lineToAdd.getBytes(), StandardOpenOption.APPEND);
        for (String line : Files.readAllLines(path)) {
            System.out.println(line);
        }
    }
}
