package com.mthree.java_classes_and_objects.simple_calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int userInput;
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        do {
            System.out.println("\nWelcome to the Calculator!\n");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("\nPlease pick an option: ");
            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.print("Enter first number: ");
                    simpleCalculator.setOperand1(scanner.nextInt());

                    System.out.print("Enter second number: ");
                    simpleCalculator.setOperand2(scanner.nextInt());

                    System.out.println("Your output is: " +
                            simpleCalculator.calculate('+'));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    simpleCalculator.setOperand1(scanner.nextInt());

                    System.out.print("Enter second number: ");
                    simpleCalculator.setOperand2(scanner.nextInt());

                    System.out.println("Your output is: " +
                            simpleCalculator.calculate('-'));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    simpleCalculator.setOperand1(scanner.nextInt());

                    System.out.print("Enter second number: ");
                    simpleCalculator.setOperand2(scanner.nextInt());

                    System.out.println("Your output is: " +
                            simpleCalculator.calculate('*'));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    simpleCalculator.setOperand1(scanner.nextInt());

                    System.out.print("Enter second number: ");
                    simpleCalculator.setOperand2(scanner.nextInt());

                    System.out.println("Your output is: " +
                            simpleCalculator.calculate('/'));
                    break;

                case 5:
                    System.out.println("Thank you for using our Calculator!");
                    break;

                default:
                    System.out.println("Invalid input!");
                    break;
            }
        } while (userInput != 5);

    }
}
