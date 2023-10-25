package homework.hw9;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static void main(String[] args) {
        int players = 25;
        int[] firstTeam = generateAge(players);
        int[] secondTeam = generateAge(players);

        double firstTeamAverageAge = averageAge(firstTeam);
        double secondTeamAverageAge = averageAge(secondTeam);

        System.out.println("\n" + "Age of first team players:" + "\n" + Arrays.toString(firstTeam));
        System.out.println("\n" + "Age of second team players:" + "\n" + Arrays.toString(secondTeam));
        System.out.println("\n" + "Average age of first team players is " + firstTeamAverageAge + " years.");
        System.out.println("\n" + "Average age of second team players is " + secondTeamAverageAge + " years.");
    }

    public static int[] generateAge(int players) {
        int[] age = new int[players];
        for (int i = 0; i < age.length; i++) {
            int randomAge = ThreadLocalRandom.current().nextInt(18, 41);
            age[i] = randomAge;
        }
        return age;
    }

    public static double averageAge(int[] age) {
        int ageSum = 0;
//        double teamAverageAge = (double) ageSum / age.length;
        for (int i : age) {
            ageSum += i;
        }
        return ageSum / (double) age.length;
    }
}