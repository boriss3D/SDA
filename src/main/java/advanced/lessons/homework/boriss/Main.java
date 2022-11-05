package advanced.lessons.homework.boriss;

public class Main {
    public static void main(String[] args) {

        Person person01 = new Employee("John", "Smith", "12345");
        System.out.println("Object Id# " + person01.getIdNumber());
        System.out.println(person01.getDetailedInfoAboutMe());
        person01.eat();
        System.out.println();

        Employee person02 = new Employee("Bill", "Gates", "66666");
        System.out.println("Object Id# " + person02.getIdNumber());
        System.out.println(person02.getDetailedInfoAboutMe());
        person02.sleep();
        System.out.println(person02.getFullName() + " has a monthly salary equal to " + person02.getSalary().getAmount()
                + " of " + person02.getSalary().getCurrency().getDescription());
        System.out.println();

        Employee person03 = new Employee("Jain", "Smith", "54321", "Miss",
                new Salary(3_000, Currency.EUR));
        System.out.println("Object Id# " + person03.getIdNumber());
        System.out.println(person03.getDetailedInfoAboutMe());
        System.out.println(person03.getFullName() + " has a monthly salary equal to " + person03.getSalary().getAmount()
                + " of " + person03.getSalary().getCurrency().getDescription());
        System.out.println();

        Person student01 = new Student("Bob", "Marley", "11111");
        System.out.println("Object Id# " + student01.getIdNumber());
        System.out.println(student01.getFullName());
        student01.eat();
        System.out.println();

        Student student02 = new Student("Jannet", "Jackson", "22222",
                "Harvard University", "1st grade");
        System.out.println("Object Id# " + student02.getIdNumber());
        System.out.println(student02.getDetailedInfoAboutMe());
        student02.sleep();
    }
}
