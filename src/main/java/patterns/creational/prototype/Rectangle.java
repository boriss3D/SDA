package patterns.creational.prototype;

public class Rectangle extends Shape {

   public Rectangle(){
     type = "Rectangle";
   }

   @Override
   public void draw() {
      System.out.println("Method draw inside of Rectangle class");
   }
}