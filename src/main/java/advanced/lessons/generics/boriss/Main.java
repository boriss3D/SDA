package advanced.lessons.generics.boriss;

public class Main {
    public static void main(String[] args) {

        Tools tools = new Tools("Hammer");
        Box<Tools> toolsBox = new Box<>(tools);
        toolsBox.put();

        Clothes clothes = new Clothes("T-shirt");
        Box<Clothes> clothesBox = new Box<>(clothes);
        clothesBox.put();
    }
}
