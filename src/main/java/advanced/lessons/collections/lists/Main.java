package advanced.lessons.collections.lists;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nameList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            nameList.add("Name" + i);
        }

        //System.out.println("Size -> " + nameList.size());

        for (String name : nameList) {
            System.out.println(name);
        }
/*
        nameList.remove("Name 3");

        for(String name:nameList){
            System.out.println(name);
        }

        System.out.println("Size -> " + nameList.size());

 */
    }

}
