package advanced.lessons.enums;

public class Main {

    public static void main(String[] args) {
//        Drink drink=new Drink();
//        drink.setCoffee(Coffee.LATTE);
//        System.out.println(drink.getCoffee());
//
//        drink.setCoffee(Coffee.AMERICANO);
//        System.out.println(drink.getCoffee());

        Car car = new Car();
        car.setColor(Color.GREEN);

        System.out.println(car.getColor());
        System.out.println(car.getColor().getColorCode());


        switch (car.getColor()) {
            case GREEN:
                System.out.println("Roheline");
                break;
            case RED:
                System.out.println("punane");
                break;
            case BLUE:
                System.out.println("sinine");
                break;
        }


    }

}
