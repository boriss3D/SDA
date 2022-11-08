package patterns.structural.decorator;

public class GoldCarDecorator extends CarDecorator {

   public GoldCarDecorator  (Car decoratedCar)   {
      super(decoratedCar);
   }

   @Override
   public void create() {
      decoratedCar.create();
      setRedBorder(decoratedCar);
   }

   private void setRedBorder(Car decoratedCar){
      System.out.println("Car Color: Gold");
   }
}