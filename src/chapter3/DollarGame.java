package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        final double controlSum = 1000; // $1 = 1 pennies;

        System.out.println("Share with me how many coins you want" +
                " and I give you it if it will be equal $1");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pennies would you like?");
        int pennies = giveWholeNumber(sc);

        System.out.println("How many nickels would you like?");
        int nickels = giveWholeNumber(sc);

        System.out.println("How many dimes?");
        int dimes = giveWholeNumber(sc);

        System.out.println("How many quarters?");
        int quarters = giveWholeNumber(sc);

        double sumResult = calculate(pennies, nickels, dimes, quarters);
        // $1 = 1000 pennies = 20 nickels = 10 dimes = 4 quarters
        if (sumResult == controlSum) {
            System.out.println("Congratulations! There is your $1!");
        } else if (sumResult < controlSum) {
            System.out.print("Sorry, you are missing $");
            double result = (controlSum - sumResult) / controlSum;
            System.out.println(result);
        } else {
            System.out.print("Sorry, over coins to win $");
            double result = (sumResult - controlSum) / controlSum;
            System.out.println(result);
        }
    }

    private static double calculate(int pennies, int nickels, int dimes, int quarters) {
        int nikelToPenny = 50;
        int dimeToPenny = 100;
        int quarterToPenny = 250;
        return pennies
                + nickels * nikelToPenny
                + dimes * dimeToPenny
                + quarters * quarterToPenny;
    }

    private static int giveWholeNumber(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Please, type whole number:");
        }

        return sc.nextInt();
    }
}
