package advanced.lessons.functional_interface;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> "supplier test!";

        getValue(stringSupplier);

    }

    static void getValue(Supplier<String> supplier) {

        System.out.println(supplier.get());

    }

}