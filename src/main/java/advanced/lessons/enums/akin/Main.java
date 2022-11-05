package advanced.lessons.enums.akin;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        date.setDay(Days.MONDAY);

        System.out.println(date.getDay());

        switch (date.getDay()) {
            case MONDAY:
                System.out.println("Ohh monday i can eat " + date.getDay().getDayNumber() + " cookie today :)");
                break;
            case TUESDAY:
                System.out.println("Today is the " + date.getDay().getDayNumber() + " day of week no cookies ");
                break;
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("This is Friday and the value is -> " + date.getDay().getDayNumber());
        }

    }

}
