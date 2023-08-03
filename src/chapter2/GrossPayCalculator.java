package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        // Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        // Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        // Mulitply hours and pay rate
        double grossPay = hours * rate;
        // Display result
        System.out.println("The employee's gross pay is $" + grossPay);
        scanner.close();
    }

}
