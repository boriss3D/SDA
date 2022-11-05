package fundamentals.tasks02;

/*
Write a Java program to reverse a word: “avaJ” Output: Java
 */
public class Task04 {
    public static void main(String[] args) {
        String[] strings = "avaJ".split("");
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.print(strings[i]);
        }
    }
}
