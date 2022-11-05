package patterns.creational.singleton;

public class SimpleSingleton {

  private static SimpleSingleton instance;

  private SimpleSingleton() {}

  public static SimpleSingleton getInstance() {
    if (instance == null) {
      instance = new SimpleSingleton();
    }
    return instance;
  }


  public static void main(String[] args) {

  }
}