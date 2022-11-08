package patterns.structural.decorator;

public class DecoratorPatternDemo {

   public static void main(String[] args) {

      Car miniCar = new MiniCar();
      Car goldMiniCar= new GoldCarDecorator(new MiniCar());
      Car goldRaisingCar = new GoldCarDecorator(new RaisingCar());
      miniCar.create();
      System.out.println("MiniCar with Normal Color");
      goldMiniCar.create();
      System.out.println("\nMiniCar with Gold color");
      goldRaisingCar.create();
      System.out.println("\nRaisingCar with Gold color");

   }

}