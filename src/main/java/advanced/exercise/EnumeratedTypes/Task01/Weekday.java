package advanced.exercise.EnumeratedTypes.Task01;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekDay() {
        return this.compareTo(Weekday.FRIDAY) <= 0;
    }

    boolean isHoliday() {
        return !isWeekDay();
    }

    void whichIsGreater(Weekday weekday) {
        if (this.compareTo(weekday) < 0) {
            System.out.println("This is a predecessor of the day of the week provided");
        } else if (this.compareTo(weekday) == 0) {
            System.out.println("This is a successor of the day of the week provided");
        } else {
            System.out.println("This is a follower of the day of the week provided");
        }
    }
}
