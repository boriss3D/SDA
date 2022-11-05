package advanced.lessons.enums.boriss;

public enum WeekDays {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int number;

    WeekDays(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
