package homework.hw17;

public class KelvinConverter extends TemperatureConverter {
    @Override
    public double toCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    @Override
    public double fromCelsius(double convertedCelsius) {
        return celsius + 273.15;
    }
}