package patterns.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(12)
                .cheese(true)
                .pepperoni(true)
                .build();
        System.out.println(pizza);

//        Pizza pizza2 = new Pizza.Builder(3)
//                .cheese(true)
//                .pepperoni(true)
//                .bacon(true)
//                .build();


    }
}
