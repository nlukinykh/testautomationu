package chapter6;

import java.util.Locale;
import java.util.Scanner;

public class PhoneBillCalculator2 {
    static Locale locale = Locale.US;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(locale);

        PhoneBill newBill = new PhoneBill();

        System.out.println("Enter base cost of the plan:");
        newBill.setBasePlan(giveDoubleNumber(sc));
        System.out.println("Enter overage minutes:");
        newBill.setOverageMins(giveWholeNumber(sc));

        newBill.getBill(locale);

    }

    private static double giveDoubleNumber(Scanner sc) {
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Please, type number in format XX.XX");
        }

        return sc.nextDouble();
    }

    private static int giveWholeNumber(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Please, type whole number");
        }

        return sc.nextInt();
    }

}
