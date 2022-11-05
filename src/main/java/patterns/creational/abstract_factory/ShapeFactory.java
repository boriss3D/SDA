package patterns.creational.abstract_factory;

public class ShapeFactory extends AbstractFactory {
 @Override
 public Shape getShape(String shapeType){
  if(shapeType == null){
   return null;
  }
  if(shapeType.equalsIgnoreCase("CIRCLE")){
   return new Circle();
  }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
   return new Rectangle();
  }else if(shapeType.equalsIgnoreCase("SQUARE")){
   return new Square();
  }
  return null;
 }

    @Override
    Font getFont(String font) {
        return null;
    }

    @Override
 Color getColor(String color) {
  return null;
 }
}
