package Homework;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String args[]) {
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate (Enter only numbers as a percentage): ");
        double annInterestRate = scanner.nextDouble();
        double monInterestRate = (annInterestRate/PERCENT)/MONTHS_IN_YEAR;

        System.out.print("Time Period (Years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period*MONTHS_IN_YEAR;

        double mortgage = principal * ((monInterestRate*(Math.pow(1+monInterestRate, (numberOfPayments))))/(Math.pow((1+monInterestRate), (numberOfPayments))-1));

        System.out.println("Mortagage: " + NumberFormat.getCurrencyInstance().format(mortgage));


    }
}
