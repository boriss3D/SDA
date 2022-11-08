package patterns.structural.decorator;

public class RaisingCar implements Car {

   @Override
   public void create() {
      System.out.println("Car: Raising");
   }
}