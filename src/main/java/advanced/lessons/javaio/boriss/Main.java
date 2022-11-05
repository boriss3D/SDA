package advanced.lessons.javaio.boriss;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add("name" + i);
        }

        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter("src/main/java/org/example/javaio/boriss/user_output.txt"));
        for (String s : arrayList) {
            bufferedWriter.write(s + "\n");
        }

        bufferedWriter.close();
    }
}
