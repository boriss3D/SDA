package patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterUsage {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new PupilAdapter(new Pupil("Andrzej", "Nowak",
            "anowak@sda.ee", 19, List.of(3, 4, 5))));
    for (final Student student : students) {
      System.out.println(student.getFullName()); // Andrzej Nowak
      System.out.println(student.getContactDetails()); // anowak@sda.pl
      System.out.println(student.getResults()); // [3, 4, 5]
      System.out.println(student.isAdult()); // true
    }
  }
}