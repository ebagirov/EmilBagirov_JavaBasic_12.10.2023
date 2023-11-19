package homework.hw17;

import java.util.Scanner;

public class TemperatureConverterRunner {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\n\t 'TEMPERATURE CONVERTER' \t");
        System.out.println("\n Hello! Need to convert temperature to another unit? Try this programme :)");
        System.out.print("\nEnter temperature unit in °C: ");
        double temperatureCelsius = scanner.nextDouble();

        KelvinConverter celsiusToKelvinConverter = new KelvinConverter();
        FahrenheitConverter celsiusToFahrenheitConverter = new FahrenheitConverter();

        System.out.println("\tTemperature conversions: ");

        double kelvinTemperature = celsiusToKelvinConverter.fromCelsius(temperatureCelsius);
        System.out.println(temperatureCelsius + "°C converted to " + kelvinTemperature + "K");

        double fahrenheitTemperature = celsiusToFahrenheitConverter.fromCelsius(temperatureCelsius);
        System.out.println(temperatureCelsius + "°C converted to " + fahrenheitTemperature + "°F");

        double celsiusFromKelvin = celsiusToKelvinConverter.toCelsius(kelvinTemperature);
        System.out.println(kelvinTemperature + "°K converted to " + celsiusFromKelvin + "°C");

        double celsiusFromFahrenheit = celsiusToFahrenheitConverter.toCelsius(fahrenheitTemperature);
        System.out.println(fahrenheitTemperature + "°F converted to " + celsiusFromFahrenheit + "°C");
    }
}