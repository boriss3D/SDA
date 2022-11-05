package patterns.creational.factory;

public class FactoryPatternDemo {

   public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();

      Shape shape1 = shapeFactory.getShape("CIRCLE");
      shape1.draw();
      System.out.println(shape1.calculateArea());

      Shape shape2 = shapeFactory.getShape("RECTANGLE");
      shape2.draw();
      System.out.println(shape2.calculateArea());

      Shape shape3 =  shapeFactory.getShape("TRIANGLE");
      shape3.draw();
      System.out.println(shape3.calculateArea());

   }
}
