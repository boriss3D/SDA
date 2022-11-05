package patterns.creational.prototype;

public class Square extends Shape {

   public Square(){
     type = "Square";
   }

   @Override
   public void draw() {
      System.out.println("Method draw inside of Square class");
   }
}