package advanced.exercise.ClassesAndInterfaces.Task04;

public class User {
    private String name;
    private String lastName;
    private int age;
    private String login;
    private String password;

    public void setName(String name, Validator<String> validator) {
        if (validator.validate(name)) {
            this.name = name;
        }
    }

    public void setLastName(String lastName, Validator<String> validator) {
        if (validator.validate(lastName)) {
            this.lastName = lastName;
        }
    }

    public void setAge(int age, Validator<Integer> validator) {
        if (validator.validate(age)) {
            this.age = age;
        }
    }

    public void setLogin(String login, Validator<String> validator) {
        if (validator.validate(login)) {
            this.login = login;
        }
    }

    public void setPassword(String password, Validator<String> validator) {
        if (validator.validate(password)) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
