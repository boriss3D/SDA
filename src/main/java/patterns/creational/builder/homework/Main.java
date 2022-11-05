package patterns.creational.builder.homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Dog dog = new Dog.Builder()
                .withName("Sid")
                .withType("Pointer")
                .withAge(5)
                .withToys(List.of("toy01", "toy02","toy03"))
                .build();

        System.out.println(dog.getName());
        System.out.println(dog.getType());
        System.out.println(dog.getAge());
        System.out.println(dog.getToys());
    }
}
