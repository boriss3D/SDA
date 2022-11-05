package advanced.exercise.EnumeratedTypes.Task03;

public class Main {
    public static void main(String[] args) {
        float convertedTemperature01 = TemperatureConvert.convertTemperature("kelvin",
                "celsius", 100.0f);
        System.out.println(convertedTemperature01);

        float convertedTemperature02 = TemperatureConvert.convertTemperature("kelvin",
                "fahrenheit", 101.0f);
        System.out.println(convertedTemperature02);

        float convertedTemperature03 = TemperatureConvert.convertTemperature("celsius",
                "fahrenheit", 102.0f);
        System.out.println(convertedTemperature03);
    }
}
