package advanced.exercise.ClassesAndInterfaces.Task04;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.setName("Boriss", input -> {
            if(input == null) return false;
            if(input.equals("")) return false;
            return Character.isUpperCase(input.charAt(0));
        });

        user.setLastName("Harin", input -> {
            if(input == null) return false;
            if(input.equals("")) return false;
            return Character.isUpperCase(input.charAt(0));
        });

        user.setAge(43, input -> input > 0 && input < 150);

        user.setLogin("User123456", input -> input.length() == 10);

        user.setPassword("qwe!rty", input -> {
            for (String s : input.split("")) {
                if ("!".equals(s)) {
                    return true;
                }
            }
            return false;
        });

        System.out.println(user);
    }
}
