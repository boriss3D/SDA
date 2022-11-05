package patterns.creational.abstract_factory;

public abstract class AbstractFactory {
  abstract Color getColor(String color);
  abstract Shape getShape(String shape) ;
  abstract Font getFont(String font);
}
