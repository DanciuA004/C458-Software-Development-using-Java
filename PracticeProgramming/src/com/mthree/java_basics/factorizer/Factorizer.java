package com.mthree.java_basics.factorizer;

import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {
        int countFactors = 0;
        int perfectNumber = 0;
        boolean primeNumber = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to factor? ");
        int number = scanner.nextInt();

        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                countFactors++;
                perfectNumber += i;
                if (i > 1) {
                    primeNumber = false;
                }
            }
        }

        System.out.println("\n" + number + " has " + countFactors + " factors.");

        if (perfectNumber == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        if (primeNumber) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
