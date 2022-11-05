package advanced.lessons.javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {


    public static void main(String[] args) throws IOException {

        Person p1 = new Person("name1");
        Person p2 = new Person("name2");

        BufferedWriter output = new BufferedWriter(new FileWriter("src/personNames.txt"));

        output.write(p1.getName() + "\n");
        output.write("\n");
        output.write(p2.getName());

        output.close();

    }

}
