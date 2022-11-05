package advanced.lessons.homework.boriss;

public class Student extends Person {
    private String schoolName;
    private String grade;

    public Student(String name, String surname, String idNumber) {
        super(name, surname, idNumber);
    }

    public Student(String name, String surname, String idNumber, String schoolName, String grade) {
        super(name, surname, idNumber);
        this.schoolName = schoolName;
        this.grade = grade;
    }

    @Override
    String getDetailedInfoAboutMe() {
        String result = "";
        if (!schoolName.isEmpty()) {
            result += schoolName + " ";
        }
        if (!grade.isEmpty()) {
            result += grade + " ";
        }
        return result + super.getFullName();
    }

    @Override
    public void eat() {
        System.out.println(getFullName() + " does not have time to eat! Need to study!");
    }

    @Override
    public void sleep() {
        System.out.println(getFullName() + " does not have time to sleep! Need to study!");
    }
}
