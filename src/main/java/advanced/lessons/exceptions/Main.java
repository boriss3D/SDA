package advanced.lessons.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Execution is started");

        List<String> values = new ArrayList<>();
        values.add("value 1");
        System.out.println("Size of the list is " + values.size());

        try {
            //
            //
            // assume that 100 lines of codes here
            //
            //
            System.out.println(values.get(1));
            // open our database connection here
            // i committed my changes
        } catch (IndexOutOfBoundsException | IllegalArgumentException illegalArgumentException) {
            System.out.println("Oooo an exception is occured with details ->");
        } finally {
            // this block is always run!
            // i can close my db connection here
            System.out.println("Finally block is run!");
        }

        System.out.println("Execution is completed");

    }

}
