package com.mthree.java_basics.fors;

import java.util.*;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many units of fizzing and buzzing do you need in your life? ");
        int answer = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < answer; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizz buzz");
                i = ++i;
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!!!");
    }
}
