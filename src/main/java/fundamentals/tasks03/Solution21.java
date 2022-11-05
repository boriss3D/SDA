package fundamentals.tasks03;

import java.util.Arrays;

public class Solution21 {
    static String[] getDistinct(String[] strings) {

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].equals(strings[j]) && i != j) {
                        strings[j] = "duplicate";
                    }
                }
            }

        int duplicatesNumber = 0;
        for(String s : strings) {
            if("duplicate".equals(s)){
                duplicatesNumber++;
            }
        }

        String[] out = new String[strings.length - duplicatesNumber];
        int count = 0;
        for (String s : strings) {
            if(!"duplicate".equals(s)) {
                out[count] = s;
                count++;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        String[] strings = {"str1", "str2", "str3", "str3", "str4", "str3", "str4"};
        System.out.println(Arrays.toString(getDistinct(strings)));
    }
}
