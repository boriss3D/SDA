package patterns.structural.decorator;

public abstract class CarDecorator implements Car {

   protected Car decoratedCar;

   public CarDecorator(Car decoratedCar){
       this.decoratedCar = decoratedCar;
   }

   public void draw(){
       decoratedCar.create();
   }	
}
