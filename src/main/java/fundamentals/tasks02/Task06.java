package fundamentals.tasks02;

/*
Write a Java program to create the concatenation of the two strings except removing the first character of each string.
The length of the strings must be 1 and above: “Java” and “Fundamentals”
Output: avaundamentals
 */
public class Task06 {
    public static void main(String[] args) {
        String string1 = "Java";
        String string2 = "Fundamentals";
        System.out.println(string1.substring(1) + string2.substring(1));
    }
}
