package advanced.exercise.IO.Task04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        String longest = "";
        Path path = Paths.get("src/IO/Task04/Task04.txt");
        for (String line : Files.readAllLines(path)) {
            String[] strings = line.split(" ");
            for (String s : strings) {
                s = s.replaceAll("[^a-zA-Z0-9]", "");
                if (longest.length() < s.length()) {
                    longest = s;
                }
            }
        }
        System.out.println(longest);
    }
}
