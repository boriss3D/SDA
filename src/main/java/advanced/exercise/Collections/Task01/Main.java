package advanced.exercise.Collections.Task01;

public class Main {
    public static void main(String[] args) {
        SDAArrayList<Integer> sdaArrayList = new SDAArrayList<>();

        sdaArrayList.add(1);
        sdaArrayList.add(2);
        sdaArrayList.add(3);
        sdaArrayList.add(4);
        sdaArrayList.add(5);
        sdaArrayList.add(6);
        sdaArrayList.remove(4);
        sdaArrayList.remove(7);
        System.out.println(sdaArrayList.get(1));
        System.out.println(sdaArrayList.get(3));
        sdaArrayList.display();

        System.out.println();

        SDAArrayList<String> sdaArrayListString = new SDAArrayList<>();
        sdaArrayListString.add("one");
        sdaArrayListString.add("two");
        sdaArrayListString.add("three");
        sdaArrayListString.add("four");
        sdaArrayListString.add("five");
        sdaArrayListString.add("six");
        sdaArrayListString.remove("four");
        sdaArrayListString.remove("seven");
        System.out.println(sdaArrayListString.get(1));
        System.out.println(sdaArrayListString.get(3));
        sdaArrayListString.display();
    }
}
