package advanced.lessons.interfaces;

public class Person implements PersonBehaviours {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating...");
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking...");
    }
}
