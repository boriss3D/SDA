package patterns.creational.factory;

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Draw method from Circle object");
   }

   @Override
   public int calculateArea() {
      return 1;
   }
}
