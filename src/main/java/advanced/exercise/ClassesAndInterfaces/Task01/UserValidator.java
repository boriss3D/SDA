package advanced.exercise.ClassesAndInterfaces.Task01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public String[] validateEmails(String email, String alternativeEmail) {

        class Email {
            private final String email;

            public Email(String email) {
                if (email == null || email.isEmpty()) {
                    this.email = "unknown";
                } else {
                    Pattern pattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
                    Matcher matcher = pattern.matcher(email);
                    if (matcher.matches()) {
                        this.email = email;
                    } else {
                        this.email = "unknown";
                    }
                }
            }

            public String getEmail() {
                return email;
            }
        }

        return new String[]{new Email(email).getEmail(), new Email(alternativeEmail).getEmail()};
    }
}
