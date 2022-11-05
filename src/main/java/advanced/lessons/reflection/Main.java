package advanced.lessons.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //Car car = new Car();
        //car.setModel("Ford");
        //car.setProductionYear(2020);
        //car.setVin("123456789");

        //System.out.println(car.getProductionInformation());

        Class<?> carClass = Class.forName("org.example.reflection.Car");
        Car car = (Car) carClass.newInstance();
        car.setVin("132");
        car.setModel("model of the car");
        car.setProductionYear(2021);
        //System.out.println(car.getProductionInformation());
        Method getProductionInformation = carClass.getDeclaredMethod("getProductionInformation");
        getProductionInformation.setAccessible(true);
        //System.out.println(getProductionInformation.invoke(car));

        Method[] methods = carClass.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }

    }

}
