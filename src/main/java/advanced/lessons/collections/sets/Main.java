package advanced.lessons.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> nameSet = new HashSet<>();

        System.out.println("Is empty -> " + nameSet.isEmpty());

        nameSet.add(12);

        nameSet.add(11);

        nameSet.add(5);

        for (int i = 0; i < 10; i++) {
            nameSet.add(i);
        }

        System.out.println("Is empty -> " + nameSet.isEmpty());

        System.out.println("Size of elements -> " + nameSet.size());

        //for(typeOfelementsInCollection  variableName : collection)
//        for  (String                      name         : nameSet) {
//            System.out.println(name);
//        }

        for (Integer number : nameSet) {
            System.out.println(number);
        }

        //nameSet.forEach();
/*
        nameSet.add("NameSurname10");
        System.out.println("Size of elements -> " + nameSet.size());
        nameSet.add("NameSurname11");
        System.out.println("Size of elements -> " + nameSet.size());
        nameSet.add("NameSurname11");
        System.out.println("Size of elements -> " + nameSet.size());
        nameSet.add("NameSurname11");
        System.out.println("Size of elements -> " + nameSet.size());
        nameSet.add("NameSurname11");
        System.out.println("Size of elements -> " + nameSet.size());
        nameSet.add("NameSurname11");
        nameSet.add("NameSurname11");
        nameSet.add("NameSurname11");
        nameSet.add("NameSurname11");
        nameSet.add("NameSurname11");
        nameSet.add("NameSurname11");
        nameSet.add("NameSurname11");
        nameSet.add("NameSurname11");
        nameSet.add("NameSurname11");
        nameSet.add("NameSurname11");
        nameSet.add("NameSurname11");
        System.out.println("Size of elements -> " + nameSet.size());
*/

    }

}
