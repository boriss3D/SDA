package advanced.lessons.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Person person1 = new Person("Name1", "Surname1", "1");
        //Person person2 = new Person("Name2", "Surname2", "2");
        Person person3 = new Person("Name3", "Surname3", "3");
        Person person4 = new Person("Name3", "Surname3", "4");


        Map<String, Person> personMap = new HashMap<>();

        Person person1 = new Person("Akin", "Garagon", "1234");
        Person person2 = new Person("John", "Doe", "5678");

        personMap.put("1", person1);
        personMap.put("2", person2);
        personMap.put("3", person3);
        personMap.put("4", person4);


        for (String id : personMap.keySet()) {
            System.out.println(id);
        }

        //personMap.values()
        //type variablename collection
        for (Person personVariable : personMap.values()) {
            System.out.println(personVariable.toString());
        }


    }


}
