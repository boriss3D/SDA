package advanced.lessons.homework.boriss;

public class Employee extends Person {

    private final Salary salary;
    private String title;

    public Employee(String name, String surname, String idNumber) {
        super(name, surname, idNumber);
        title = "";
        salary = new Salary(0, Currency.NOTHING);
    }

    public Employee(String name, String surname, String idNumber, String title, Salary salary) {
        super(name, surname, idNumber);
        this.title = title;
        this.salary = salary;
    }

    public Salary getSalary() {
        return salary;
    }

    @Override
    String getDetailedInfoAboutMe() {
        if (!title.isEmpty()) {
            title += " ";
        }
        return title + super.getFullName();
    }

    @Override
    public void eat() {
        System.out.println(getFullName() + " ate.");
    }

    @Override
    public void sleep() {
        System.out.println(getFullName() + " fell asleep.");
    }
}
