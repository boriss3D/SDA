package advanced.lessons.javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream("src/user.txt");

        FileOutputStream out = new FileOutputStream("src/user_output.txt");

        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

    }

}
