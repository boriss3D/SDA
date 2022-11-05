package advanced.lessons.javaio;

import java.nio.CharBuffer;
import java.util.Arrays;

public class BufferExample2 {

    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(8);
        String text = "sda";
        System.out.println("Input text: " + text);

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            buffer.put(c);
        }
        System.out.println("Position after data is written into buffer: " + Arrays.toString(buffer.array()));
        buffer.put('1');
        System.out.println("Position after data is written into buffer: " + Arrays.toString(buffer.array()));
    }

}
