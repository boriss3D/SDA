package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String id;
    private int age;

    private List<Course> courseList;

    public Student(String name, String id,
                   int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        courseList = new ArrayList<>();
    }

    public List<Course> getList() {
        return courseList;
    }

    public void add (Course course){
        courseList.add(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age='" + age + '\'' +
                ", list=" + courseList +
                '}';
    }
}
