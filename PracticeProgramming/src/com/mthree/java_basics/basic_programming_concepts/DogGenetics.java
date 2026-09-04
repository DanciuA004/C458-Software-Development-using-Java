package com.mthree.java_basics.basic_programming_concepts;

import java.util.*;

public class DogGenetics {
    public static void main(String[] args) {
        String[] dogBreeds = {
                "Labrador Retriever",
                "German Shepherd",
                "Golden Retriever",
                "Beagle",
                "Poodle"
        };
        int percent = 100;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your dog's name? ");
        String dogName = scanner.nextLine();

        System.out.println(dogName + " is:");

        for (int i = 0; i < 5; i++) {
            int percentBreed = random.nextInt(percent) + 1;
            percent -= percentBreed;
            System.out.println(percentBreed + "% " + dogBreeds[i]);
        }

        System.out.println("Wow, that's QUITE the dog!");
    }
}
