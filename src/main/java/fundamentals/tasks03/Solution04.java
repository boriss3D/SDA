package fundamentals.tasks03;

public class Solution04 {
    public static void main(String[] args) {
        int intVar1 = 5;
        int intVar2 = 10;

        short shortSum = (short) (intVar1 + intVar2);
        System.out.println(shortSum);
        System.out.println(shortSum++);

        byte byteSum = (byte)(intVar1 + intVar2);
        System.out.println(byteSum);
        System.out.println(++byteSum);

    }
}
