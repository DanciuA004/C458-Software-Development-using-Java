package com.mthree.java_basics.interest_calculator;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much do you want to invest? ");
        double money = scanner.nextDouble();

        System.out.print("How many years are investing? ");
        int years = scanner.nextInt();

        System.out.println("What is the annual interest rate % growth? ");
        double annualInterestRate = scanner.nextInt();
        double quarterlyInterestRate = annualInterestRate / 4;

        for (int year = 1; year <= years; year++) {
            double moneyBeggining = money;

            for (int quarter = 0; quarter < 4; quarter++) {
                money = money * (1 + (quarterlyInterestRate / 100));
            }

            double earned = money - moneyBeggining;

            System.out.println("Year " + year + ": ");
            System.out.println("Began with $" + Math.round(moneyBeggining));
            System.out.println("Earned $" + Math.round(earned));
            System.out.println("Ended with $" + Math.round(money));
        }
    }
}
