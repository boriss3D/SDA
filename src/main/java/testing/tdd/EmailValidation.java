package testing.tdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public boolean emailValidation(String email) {
        Pattern pattern = Pattern.compile("[a-z\\d.]+@[a-z]+\\.[a-z]{2,3}");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
