package advanced.lessons.interfaces;

public class Employee extends Person implements EmployeeBehaviours {

    public Employee(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void work() {
        System.out.println(name + " is working...");
    }

    @Override
    public void haveVacation() {
        System.out.println(name + " having vacation...");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating lunch!");
    }

}
