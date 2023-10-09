package homework.hw6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Hello User!
                Let's play the game "Guess the Number"!
                Try to guess the number from 0 to 10 that I wished for. You only have four tries.""");
        int minValue = 0;
        int maxValue = 10;
        int value = ThreadLocalRandom.current().nextInt(minValue, maxValue + 1);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number: ");
            int inputNumber = scanner.nextInt();
            if (inputNumber < value) {
                System.out.println("Wrong value. You lose.");
            } else if (inputNumber > value) {
                System.out.println("Wrong value. You lose.");
            } else {
                System.out.println("You win!");
                break;
            }
        }
    }
}