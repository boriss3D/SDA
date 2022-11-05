package advanced.exercise.EnumeratedTypes.Task03;

public enum TemperatureConvert {
    C_F("celsius", "fahrenheit", tempIn -> tempIn * 9.0f / 5.0f + 32.0f),
    C_K("celsius", "kelvin", tempIn -> tempIn + 273.15f),
    K_C("kelvin", "celsius", tempIn -> tempIn - 273.15f),
    F_C("fahrenheit", "celsius", tempIn -> (tempIn - 32.0f) * 5.0f / 9.0f),
    F_K("fahrenheit", "kelvin", tempIn -> (tempIn - 32.0f) * 5.0f / 9.0f + 273.15f),
    K_F("kelvin", "fahrenheit", tempIn -> (tempIn - 273.15f) * 9.0f / 5.0f + 32.0f);

    final String inputTemperatureUnit;
    final String outputTemperatureUnit;
    final Converter converter;

    TemperatureConvert(String inputTemperatureUnit, String outputTemperatureUnit, Converter converter) {
        this.inputTemperatureUnit = inputTemperatureUnit;
        this.outputTemperatureUnit = outputTemperatureUnit;
        this.converter = converter;
    }

    static float convertTemperature(String inputTemperatureUnit, String outputTemperatureUnit, float valueOfTheTemperature) {
        float result = 0.0f;

        for (TemperatureConvert temperatureConvert : TemperatureConvert.values()) {
            if (temperatureConvert.inputTemperatureUnit.equals(inputTemperatureUnit) &&
                    temperatureConvert.outputTemperatureUnit.equals(outputTemperatureUnit)) {
                result = temperatureConvert.converter.convert(valueOfTheTemperature);
            }
        }
        return result;
    }
}
