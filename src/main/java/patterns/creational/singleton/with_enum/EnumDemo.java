package patterns.creational.singleton.with_enum;

public class EnumDemo {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);


        SingletonEnum singleton2 = SingletonEnum.INSTANCE;
        System.out.println(singleton2.getValue());
    }
}