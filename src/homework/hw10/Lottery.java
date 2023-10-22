package homework.hw10;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        int[] ticket = new int[7];
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = ThreadLocalRandom.current().nextInt(10);
        }
        int[] player = new int[7];
        for (int j = 0; j < player.length; j++) {
            player[j] = ThreadLocalRandom.current().nextInt(10);
        }
        System.out.println("\n" + "Ticket: " + Arrays.toString(ticket));
        System.out.println("Player: " + Arrays.toString(player) + "\n");

        for (int i = 0; i < ticket.length; i++) {
            for (int j = 0; j < ticket.length; j++) {
                if (ticket[i] < ticket[j]) {
                    int tmp = ticket[i];
                    ticket[i] = ticket[j];
                    ticket[j] = tmp;
                }
            }
        }
        for (int i = 0; i < player.length; i++) {
            for (int j = 0; j < player.length; j++) {
                if (player[i] < player[j]) {
                    int tmp = player[i];
                    player[i] = player[j];
                    player[j] = tmp;
                }
            }
        }
        System.out.println("Ticket sort: " + Arrays.toString(ticket));
        System.out.println("Player sort: " + Arrays.toString(player) + "\n");
        System.out.println("Matched numbers: " + results(ticket, player));
    }

    public static int results(int[] ticket, int[] player) {
        int count = 0;
        for (int i = 0; i < ticket.length; i++) {
            if (ticket[i] == player[i]) {
                count++;
            }
        }
        return count;
    }
}