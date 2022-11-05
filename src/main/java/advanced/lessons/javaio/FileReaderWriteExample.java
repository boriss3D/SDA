package advanced.lessons.javaio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriteExample {

    public static void main(String[] args) throws IOException {

        FileReader in = new FileReader("src/user.txt");
        FileWriter out = new FileWriter("src/user_output.txt");

        int nextChar;
        while ((nextChar = in.read()) != -1) {
            out.append((char) nextChar);
        }

        out.append('1');
        out.append('2');
        out.append('3');
        out.append('4');

        //
        out.close();

    }

}
