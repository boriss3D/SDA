package advanced.lessons.java8;

public class Main {

    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println("do sth here");
            System.out.println("write sth");
            System.out.println("do sth here also");
        };

        Runnable r1 = new RunnableTaskClass();

    }

}
