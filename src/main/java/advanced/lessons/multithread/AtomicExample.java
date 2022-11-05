package advanced.lessons.multithread;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicExample {


    public static void main(String[] args) {

        //Atomic types are thread safe
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger;
        AtomicLong atomicLong;

        //Integer needs to be synchronized if it's used from different threads
        Integer regularInt = 0;


    }

}
