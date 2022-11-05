package advanced.lessons.homework.boriss;

public enum Currency {
    EUR("Euro"),
    GBP("British Pound"),
    USD("US Dollar"),
    NOTHING("nothing");

    final private String description;

    Currency(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
