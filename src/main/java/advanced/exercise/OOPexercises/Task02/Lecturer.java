package advanced.exercise.OOPexercises.Task02;

public class Lecturer extends Person {
    private String specialization;
    private String salary;

    public Lecturer(String specialization, String salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Specialization='" + specialization + '\'' + ", salary='" + salary + "'";
    }
}
