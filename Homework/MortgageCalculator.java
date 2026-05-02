package Homework;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String args[]) {
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal ($1K - $1M): ");
        int principal = scanner.nextInt();

        while(principal < 1000 || principal > 1_000_000) {
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
        }

        System.out.print("Annual Interest Rate (Enter only numbers as a percentage): ");
        double annInterestRate = scanner.nextDouble();

        while(annInterestRate <= 0 || annInterestRate > 30) {
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            System.out.print("Annual Interest Rate: ");
            annInterestRate = scanner.nextDouble();
        }

        double monInterestRate = (annInterestRate/PERCENT)/MONTHS_IN_YEAR;

        System.out.print("Time Period (Years): ");
        byte period = scanner.nextByte();

        while(period < 1 || period > 30) {
            System.out.println("Enter a value between 1 and 30.");
            System.out.print("Period (Years): ");
            period = scanner.nextByte();
        }

        int numberOfPayments = period*MONTHS_IN_YEAR;

        double mortgage = principal * ((monInterestRate*(Math.pow(1+monInterestRate, (numberOfPayments))))/(Math.pow((1+monInterestRate), (numberOfPayments))-1));

        System.out.println("Mortagage: " + NumberFormat.getCurrencyInstance().format(mortgage));


    }
}
