package chapter4;

import java.util.Random;
import java.util.Scanner;

public class rollTheDieGame {

    public static void main(String[] args) {
        final int totalCells = 20;
        int countOfRoll = 5;
        int currentCell = 0;
        boolean win = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Game starts: roll the die (click enter)");
        sc.nextLine();
        for (int i = 1; i <= countOfRoll; i++) {
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            currentCell += die;
            if (currentCell > totalCells) {
                currentCell = totalCells;
                System.out.printf("Roll #%d: You've rolled a %d. You lose. It is too much to finish.\n", i, die);
                win = false;
                break;
            } else {
                System.out.printf("Roll #%d: You've rolled a %d. You are now on space %d and have %d more to go.\n", i, die, currentCell, totalCells - currentCell);
            }
            sc.nextLine();
        }

        if ((currentCell == totalCells) && win) {
            System.out.println("Congrats, you win!");
        } else {
            System.out.println("Sorry, you are looser!");
        }
    }
}
