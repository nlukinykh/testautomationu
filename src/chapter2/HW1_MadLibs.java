package chapter2;

import java.util.Scanner;

public class HW1_MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write season of the year:");
        String season = scanner.nextLine();

        System.out.println("Add some whole number:");
        int num = giveWholeNumber(scanner);

        System.out.println("And some adjective:");
        String adjective = scanner.nextLine();

        System.out.printf("On a %s %s day, I drink a minimum of %d cups of coffee.\n",
                adjective, season, num);
        scanner.close();
    }

    private static int giveWholeNumber(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Please, type whole number:");
        }

        return sc.nextInt();
    }
}
