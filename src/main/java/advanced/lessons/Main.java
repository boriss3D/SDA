package advanced.lessons;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        int sizeOfElements = 0;
        String[] strings = new String[10];

        if (sizeOfElements < strings.length) {
            strings[sizeOfElements] = "Name 1";
            sizeOfElements++;
        }

        if (sizeOfElements < strings.length) {
            strings[sizeOfElements] = "Name 2";
            sizeOfElements++;
        }

        //assume that we did same control here
        strings[sizeOfElements] = "Name 2";
        sizeOfElements++;

        strings[sizeOfElements] = "Name 2";
        sizeOfElements++;

        strings[sizeOfElements] = "Name 2";
        sizeOfElements++;

        strings[sizeOfElements] = "Name 2";
        sizeOfElements++;

        strings[sizeOfElements] = "Name 2";
        sizeOfElements++;

        strings[sizeOfElements] = "Name 2";
        sizeOfElements++;

        strings[sizeOfElements] = "Name 2";
        sizeOfElements++;

        strings[sizeOfElements] = "Name 2";
        sizeOfElements++;

        if (sizeOfElements < strings.length) {
            strings[sizeOfElements] = "Name 2";
        } else {
            System.out.println("There is no place for new element, sorry you can not add any more element to your array");
        }


    }
}