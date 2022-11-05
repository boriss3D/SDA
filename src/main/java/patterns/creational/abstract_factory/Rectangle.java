package patterns.creational.abstract_factory;

public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Draw method from Rectangle object");
   }
}
