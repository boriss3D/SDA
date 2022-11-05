package advanced.lessons.javaio;

import java.io.*;

public class BufferExample {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src/user.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("src/user_output.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            out.write(line + "\n");
        }

        out.write("a string\n");

        out.close();

        // Floor 3 -> Files
        // Floor 2 -> BufferedReader and BufferedWriter
        // Floor 1 -> FileReader FileWriter
        // Floor 0 -> byte streams
    }

}
