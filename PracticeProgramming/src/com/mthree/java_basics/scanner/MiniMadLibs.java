package com.mthree.java_basics.scanner;

import java.util.*;

public class MiniMadLibs {

    public static void main(String[] args) {
        String noun1, noun2, adjective1, adjective2, pluralNoun1, pluralNoun2, pluralNoun3, verbPresentTense, verbPastTense;
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play MAD LIBS!\n");
        System.out.print("I need a noun: ");
        noun1 = scanner.nextLine();

        System.out.print("Now I need an adjective: ");
        adjective1 = scanner.nextLine();

        System.out.print("A second noun: ");
        noun2 = scanner.nextLine();

        System.out.print("A number is required: ");
        number = Integer.parseInt(scanner.nextLine());

        System.out.print("A second adjective: ");
        adjective2 = scanner.nextLine();

        System.out.print("A noun, but plural: ");
        pluralNoun1 = scanner.nextLine();

        System.out.print("A second noun, also plural: ");
        pluralNoun2 = scanner.nextLine();

        System.out.print("The third and final plural noun: ");
        pluralNoun3 = scanner.nextLine();

        System.out.print("I need a verb in the present tense: ");
        verbPresentTense = scanner.nextLine();

        System.out.print("That same verb, but in the past tense: ");
        verbPastTense = scanner.nextLine();

        System.out.println("\n*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun1 + ": the " + adjective1 + " frontier. These are the voyages of the starship " + noun2 +
                ". Its " + number + "-year mission: to explore strange " + adjective2 + " " + pluralNoun1 + ", to seek out " +
                adjective2 + " " + pluralNoun2 + " and " + adjective2 + " " + pluralNoun3 + ", to boldly " +
                verbPresentTense + " where no one has " + verbPastTense + " before.");
    }
}
