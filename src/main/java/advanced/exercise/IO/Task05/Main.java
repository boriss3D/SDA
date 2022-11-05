package advanced.exercise.IO.Task05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<User> users = new ArrayList<>(3);

        Path path = Paths.get("src/IO/Task05/Task05.txt");
        for (String line : Files.readAllLines(path)) {
            String[] strings = line.split(",");
            users.add(new User(strings[0], strings[1], Integer.parseInt(strings[2])));
        }
        System.out.println(users);
    }
}
