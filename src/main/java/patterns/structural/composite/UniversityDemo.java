package patterns.structural.composite;

public class UniversityDemo {

    public static void main(String[] args) {
        Student student = new Student("alex","1",
                23);
        Course course = new Course();
        course.setId("1");
        course.setName("Design Pattern");
        student.add(course);
        System.out.println(student);
    }

}
