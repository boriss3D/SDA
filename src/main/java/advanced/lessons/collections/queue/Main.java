package advanced.lessons.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<String> customers = new LinkedList<>();
        customers.offer("name1");
        customers.offer("name2");

        System.out.println("Waiting customers number -> " + customers.size());

        System.out.println(customers.peek());

        System.out.println("Waiting customers number -> " + customers.size());

        System.out.println(customers.poll());

        System.out.println("Waiting customers number -> " + customers.size());

    }

}
