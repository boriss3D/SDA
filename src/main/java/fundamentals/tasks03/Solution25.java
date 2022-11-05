package fundamentals.tasks03;

import java.time.LocalDate;

public class Solution25 {
    static boolean isEarlier (LocalDate localDate) {
        return localDate.isBefore(LocalDate.now());
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2222, 10, 1);
        System.out.println(Solution25.isEarlier(localDate));
    }
}
