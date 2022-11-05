package advanced.exercise.Reflection.Task01;

public class Student {
    private String firstName;
    private String lastName;
    private int indexNo;
    private String fieldOfStudy;

    public Student() {
    }

    public Student(String firstName, String lastName, int indexNo, String fieldOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNo = indexNo;
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(int indexNo) {
        this.indexNo = indexNo;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
}
