package patterns.creational.abstract_factory;

public class AbstractFactoryPatternDemo {
 public static void main(String[] args) {
  //get shape factory
  AbstractFactory shapeFactory =
          FactoryProducer.getFactory("SHAPE");
  //get an object of Shape Circle
  Shape shape1 = shapeFactory.getShape("CIRCLE");
  //call draw method of Shape Circle
  shape1.draw();

  //get color factory
  AbstractFactory colorFactory =
          FactoryProducer.getFactory("COLOR");
  //get an object of Color Red
  Color color1 = colorFactory.getColor("RED");
  //call fill method of Red
  color1.fill();
  //get an object of Color Green


   AbstractFactory fontFactory =
            FactoryProducer.getFactory("Font");
   Font font = fontFactory.getFont("TIMES");
   font.setSize();
 }
}
