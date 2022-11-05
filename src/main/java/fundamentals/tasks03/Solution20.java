package fundamentals.tasks03;

public class Solution20 {
    static String concatenation (String str1, String str2, String str3) {
        return str1.concat(str2).concat(str3);
    }

    public static void main(String[] args) {
        System.out.println(concatenation("abc", "def", "gij"));
    }
}
