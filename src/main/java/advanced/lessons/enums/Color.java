package advanced.lessons.enums;

public enum Color {

    RED("#111111"),
    GREEN("#222222"),

    BLUE("#333333");

    //#ABCDEF
    private String colorCode;

    Color(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }
}
