package advanced.lessons.enums.boriss;

public class Main {
    public static void main(String[] args) {
        Week week = new Week();
        week.setWeekDays(WeekDays.SATURDAY);

        switch (week.getWeekDays().getNumber()) {
            case 1:
                System.out.println("Wake up!");
                break;
            case 2:
                System.out.println("Work");
                break;
            case 3:
                System.out.println("Work!");
                break;
            case 4:
                System.out.println("Work!!!");
                break;
            case 5:
                System.out.println("Just one more day!");
                break;
            case 6:
                System.out.println("I have made it!");
                break;
            case 7:
                System.out.println("Sleep...");
                break;
        }
    }
}
