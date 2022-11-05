package advanced.exercise.EnumeratedTypes.Task01;

public class Main {
    public static void main(String[] args) {
        Weekday weekday01 = Weekday.WEDNESDAY;
        weekday01.whichIsGreater(Weekday.TUESDAY);
        weekday01.whichIsGreater(Weekday.WEDNESDAY);
        weekday01.whichIsGreater(Weekday.THURSDAY);

        Weekday weekday02 = Weekday.MONDAY;
        Weekday weekday03 = Weekday.SATURDAY;
        Weekday weekday04 = Weekday.SUNDAY;

        System.out.println("Is " + weekday02.name() + " a week day? -> " + weekday02.isWeekDay());
        System.out.println("Is " + weekday03.name() + " a holiday? -> " + weekday03.isWeekDay());
        System.out.println("Is " + weekday04.name() + " a holiday? -> " + weekday03.isHoliday());

    }
}
