package homework.hw17;

public class FahrenheitConverter extends TemperatureConverter{
    @Override
    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    @Override
    public double fromCelsius(double celsius) {
        return celsius * 1.8 + 32;
    }
}