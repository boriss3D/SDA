package advanced.lessons.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {

        Person person1 = new Person("Name1", "Surname1", "1");
        Person person2 = new Person("Name2", "Surname2", "2");
        Person person3 = new Person("Name3", "Surname3", "3");
        Person person4 = new Person("Name4", "Surname4", "4");
        Person person5 = new Person("Name4", "Surname4", "4");

        Salary salary1 = new Salary(100);
        Salary salary2 = new Salary(200);
        Salary salary3 = new Salary(300);
        Salary salary4 = new Salary(400);
        Salary salary5 = new Salary(400);

        Map<Person, Salary> personSalaryMap = new HashMap<>();

        personSalaryMap.put(person1, salary1);
        personSalaryMap.put(person2, salary2);
        personSalaryMap.put(person3, salary3);
        personSalaryMap.put(person4, salary4);
        personSalaryMap.put(person5, salary5);

        for (Person person : personSalaryMap.keySet()) {
            System.out.println(person.toString());
            System.out.println(personSalaryMap.get(person));
        }

        //for (Salary salary : personSalaryMap.values()) {
        //    System.out.println(salary.toString());
        //}


    }

}
