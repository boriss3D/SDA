package advanced.exercise.OOPexercises.Task02;

public class Student extends Person {
    private String typeOfStudy;
    private String yearOfStudy;
    private String studyPrice;

    public Student(String typeOfStudy, String yearOfStudy, String studyPrice) {
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getStudyPrice() {
        return studyPrice;
    }

    public void setStudyPrice(String studyPrice) {
        this.studyPrice = studyPrice;
    }

    @Override
    public String toString() {
        return "TypeOfStudy='" + typeOfStudy + '\'' +
                ", yearOfStudy='" + yearOfStudy + '\'' +
                ", studyPrice='" + studyPrice + "'";
    }
}
