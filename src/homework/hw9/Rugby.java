package homework.hw9;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static void main(String[] args) {
        int players = 25;
        int[] firstTeam = generateAge(players);
        int[] secondTeam = generateAge(players);
//      int
        System.out.println("\n" + "Age of first team players:" + "\n" + Arrays.toString(firstTeam));
        System.out.println("\n" + "Age of second team players:" + "\n" + Arrays.toString(secondTeam));
    }

    public static int[] generateAge(int players) {
        int[] age = new int[players];
        for (int i = 0; i < age.length; i++) {
            int randomAge = ThreadLocalRandom.current().nextInt(18, 41);
            age[i] = randomAge;
        }
        return age;
    }
}



//        int[] secondTeam = new int[25];
//        int minAgeSecondTeam = 18;
//        int maxAgeSecondTeam = 40;
////        System.out.println("Age of second team players (years):");
//        for (int j = 0; j < secondTeam.length; j++) {
//            int randomSecondTeamAge = ThreadLocalRandom.current().nextInt(minAgeSecondTeam, maxAgeSecondTeam + 1);
//            secondTeam[j] = randomSecondTeamAge;
//            System.out.print(secondTeam[j] + " ");
//        }
//        System.out.println("\n");
//
//        int sumFirstTeam = 0;
//        for (int i : firstTeam) {   //(int i = 0; i < secondTeam.length; i++)
//            sumFirstTeam += i;      //sumFirstTeam += secondTeam[i]
//        }
//        double averageFirstTeam = (double) sumFirstTeam / firstTeam.length;
////        System.out.println("Average age of first team players is : " + averageFirstTeam + " years.");
//
//        int sumSecondTeam = 0;
//        for (int j : secondTeam) {   //(int j = 0; j < secondTeam.length; j++)
//            sumSecondTeam += j;      //sumSecondTeam += secondTeam[j]
//        }
//        double averageSecondTeam = (double) sumSecondTeam / secondTeam.length;
//        System.out.println("Average age of second team players is : " + averageSecondTeam + " years.");
//    }
//}

//    public static void main(String[] args) {
//        int[] firstTeam = new int[25];
//        int minAgeFirstTeam = 18;
//        int maxAgeFirstTeam = 40;
//        System.out.println("Age of first team players (years):");
//        for (int i = 0; i < firstTeam.length; i++) {
//            int randomFirstTeamAge = ThreadLocalRandom.current().nextInt(minAgeFirstTeam, maxAgeFirstTeam + 1);
//            firstTeam[i] = randomFirstTeamAge;
//            System.out.print(firstTeam[i] + " ");
//        }
//        System.out.println();
//
//        int[] secondTeam = new int[25];
//        int minAgeSecondTeam = 18;
//        int maxAgeSecondTeam = 40;
//        System.out.println("Age of second team players (years):");
//        for (int j = 0; j < secondTeam.length; j++) {
//            int randomSecondTeamAge = ThreadLocalRandom.current().nextInt(minAgeSecondTeam, maxAgeSecondTeam + 1);
//            secondTeam[j] = randomSecondTeamAge;
//            System.out.print(secondTeam[j] + " ");
//        }
//        System.out.println("\n");
//
//        int sumFirstTeam = 0;
//        for (int i : firstTeam) {   //(int i = 0; i < secondTeam.length; i++)
//            sumFirstTeam += i;      //sumFirstTeam += secondTeam[i]
//        }
//        double averageFirstTeam = (double) sumFirstTeam / firstTeam.length;
//        System.out.println("Average age of first team players is : " + averageFirstTeam + " years.");
//
//        int sumSecondTeam = 0;
//        for (int j : secondTeam) {   //(int j = 0; j < secondTeam.length; j++)
//            sumSecondTeam += j;      //sumSecondTeam += secondTeam[j]
//        }
//        double averageSecondTeam = (double) sumSecondTeam / secondTeam.length;
//        System.out.println("Average age of second team players is : " + averageSecondTeam + " years.");
//    }
//}