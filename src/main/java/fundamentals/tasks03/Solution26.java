package fundamentals.tasks03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution26 {
    static String[] emailsOnly(String[] strings) {
        String[] emails = new String[strings.length];
        int index = 0;
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        for (String email : strings) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                emails[index] = email;
                index++;
            }
        }
        return emails;
    }

    public static void main(String[] args) {
        String[] strings = {"sduhgsd@ijdhsf.ee", "sdcsdc.sdcs.com", "@asdasd.com", "boriss.harin@gmail.com" };
        for (String s : Solution26.emailsOnly(strings)) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}
