package patterns.creational.singleton.simple;

import patterns.creational.singleton.SimpleSingleton;

public class SingletonPatternDemo {
   public static void main(String[] args) {

      //SingleObject object = new SingleObject();
      System.out.println(SimpleSingleton.getInstance());
      System.out.println(SimpleSingleton.getInstance());

   }
}