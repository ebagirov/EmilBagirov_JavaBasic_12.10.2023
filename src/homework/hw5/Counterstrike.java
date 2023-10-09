package homework.hw5;

import java.util.Scanner;

/*
Homework 5
Counter-Strike
 */
public class Counterstrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the team name and then the number of frags for each player on the team:");
        System.out.print("CounterTerrorists = ");
        String counterTerroristsName = scanner.nextLine();
        System.out.print("PoliceFirstPlayer = ");
        int policeFirstPlayer = scanner.nextInt();
        System.out.print("PoliceSecondPlayer = ");
        int policeSecondPlayer = scanner.nextInt();
        System.out.print("PoliceThirdPlayer = ");
        int policeThirdPlayer = scanner.nextInt();
        System.out.print("PoliceFourthPlayer = ");
        int policeFourthPlayer = scanner.nextInt();
        System.out.print("PoliceFifthPlayer = ");
        int policeFifthPlayer = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Terrorists = ");
        String terroristsName = scanner.nextLine();
        System.out.print("TerroristFirstPlayer = ");
        int terroristFirstPlayer = scanner.nextInt();
        System.out.print("TerroristSecondPlayer = ");
        int terroristSecondPlayer = scanner.nextInt();
        System.out.print("TerroristThirdPlayer = ");
        int terroristThirdPlayer = scanner.nextInt();
        System.out.print("TerroristFourthPlayer = ");
        int terroristFourthPlayer = scanner.nextInt();
        System.out.print("TerroristFifthPlayer = ");
        int terroristFifthPlayer = scanner.nextInt();

        double countersAverageScore = (policeFirstPlayer + policeSecondPlayer + policeThirdPlayer + policeFourthPlayer + policeFifthPlayer) / 5.0;
        double terroristsAverageScore = (terroristFirstPlayer + terroristSecondPlayer + terroristThirdPlayer + terroristFourthPlayer + terroristFifthPlayer) / 5.0;

        double epsilon = 0.001;
        if (Math.abs(countersAverageScore - terroristsAverageScore) < epsilon) {
            System.out.println("The game is a draw.");
        } else if ((terroristsAverageScore - countersAverageScore) > epsilon) {
            System.out.println("Team " + terroristsName + " win! Average score: " + terroristsAverageScore);
        } else {
            System.out.println("Team " + counterTerroristsName + " win! Average score: " + countersAverageScore);
        }
    }
}