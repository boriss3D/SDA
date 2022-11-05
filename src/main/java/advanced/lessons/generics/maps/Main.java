package advanced.lessons.generics.maps;

public class Main {

    public static void main(String[] args) {

        Pair<String, String> stringPair = new Pair<>("keyStr", "valueStr");

        stringPair.printKeyValuePair();

        Pair<String, Long> stringLongPair = new Pair<>("keyStr", 15l);
        stringLongPair.printKeyValuePair();

        Pair<String, Integer> stringIntegerPair = new Pair<>("keyStr", 45);
        stringIntegerPair.printKeyValuePair();

        Pair<String, Glass> stringGlassPair = new Pair<>("glassKey", new Glass("plastic"));
        stringGlassPair.printKeyValuePair();

    }

}
