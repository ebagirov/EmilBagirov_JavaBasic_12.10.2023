package homework.hw17;

import java.util.Scanner;

public class TemperatureConverterRunner {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        KelvinConverter celsiusToKelvinConverter = new KelvinConverter();
        FahrenheitConverter celsiusToFahrenheitConverter = new FahrenheitConverter();

        double temperatureCelsius = scanner.nextDouble();
        System.out.print("Enter temperature in °C: ");

        double kelvinTemperature = celsiusToKelvinConverter.fromCelsius(temperatureCelsius);
        System.out.println(temperatureCelsius + "°C degrees converted to " + kelvinTemperature + "K");

        double celsiusFromKelvin = celsiusToKelvinConverter.toCelsius(kelvinTemperature);
        System.out.println(kelvinTemperature + "K degrees converted to " + celsiusFromKelvin + "°C");

        double fahrenheitTemperature = celsiusToFahrenheitConverter.fromCelsius(temperatureCelsius);
        System.out.println(temperatureCelsius + "°C degrees converted to " + fahrenheitTemperature + "°F");

        double celsiusFromFahrenheit = celsiusToFahrenheitConverter.toCelsius(fahrenheitTemperature);
        System.out.println(fahrenheitTemperature + "°F degrees converted to " + celsiusFromFahrenheit + "°C");
    }
}