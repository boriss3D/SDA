package patterns.creational.singleton.simple;

public class SingleObject {


   private static final SingleObject instance = new SingleObject();

   private SingleObject(){
      System.out.println("Single object constructor");
   }

   public static SingleObject getInstance(){
      System.out.println("get instance");
      return instance;
   }

}