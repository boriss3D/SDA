package advanced.exercise.OOPexercises.Task02;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Java from scratch", "2022/2023", "2000 Euro");
        student.setName("Boriss");
        student.setAddress("Tallinn");
        System.out.println(student.getName() + " from " + student.getAddress() + ": " + student);

        student.setTypeOfStudy("Java Advanced");
        System.out.println(student.getTypeOfStudy());
        student.setYearOfStudy("2023/2024");
        System.out.println(student.getYearOfStudy());
        student.setStudyPrice("2100");
        System.out.println(student.getStudyPrice());

        Lecturer lecturer = new Lecturer("Java - Advanced Features", "10_000");
        if (lecturer.getName().isEmpty() && lecturer.getAddress().isEmpty()) {
            lecturer.setName("Akın");
            lecturer.setAddress("Tallinn");
        }
        System.out.println(lecturer.getName() + ", " + lecturer);

        lecturer.setName("New teacher");
        lecturer.setSalary("9_000");
        lecturer.setSpecialization("Java - Core");
        System.out.println(lecturer.getName() + ", salary: " + lecturer.getSalary() + ", Specialisation: " +
                lecturer.getSpecialization());
    }
}
