package advanced.lessons.homework.boriss;

public abstract class Person implements HumanBehavior {
    private final String name;
    private final String surname;
    private final String idNumber;

    public Person(String name, String surname, String idNumber) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
    }

    String getFullName() {
        return name + " " + surname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    abstract String getDetailedInfoAboutMe();
}
