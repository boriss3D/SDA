package advanced.lessons.collections.queue;

import java.util.*;

public class DequeMain {

    public static void main(String[] args) {

        Queue<String> customersQ = new LinkedList<>();

        ArrayList<String> arr = new ArrayList<>();

        Deque<String> customers = new ArrayDeque<>();

        customersQ.poll();

        customers.pollLast();


    }

}
