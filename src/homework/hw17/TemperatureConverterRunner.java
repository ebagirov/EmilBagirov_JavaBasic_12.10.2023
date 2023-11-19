package homework.hw17;

import java.util.Scanner;

public class TemperatureConverterRunner {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        KelvinConverter celsiusToKelvinConverter = new KelvinConverter();
        FahrenheitConverter celsiusToFahrenheitConverter = new FahrenheitConverter();

        System.out.print("Enter temperature in °C: ");
        double temperatureCelsius = scanner.nextDouble();
    }
}