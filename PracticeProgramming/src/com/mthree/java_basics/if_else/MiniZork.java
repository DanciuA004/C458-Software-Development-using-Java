package com.mthree.java_basics.if_else;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class MiniZork {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house, with a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you live. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("You stick your hand in and feel around.");
                System.out.println("Your fingers brush against something cold.");
                System.out.print("Grab it or take hand out");
                action = userInput.nextLine();

                if (action.equals("grab it")) {
                    System.out.println("You curl your fingers around the object and pull it out.");
                    System.out.println("It's a note saying: 'GO AWAY!'. How rude.");
                } else if (action.equals("take hand out")) {
                    System.out.println("You take your hand out of the mailbox and it is still perfectly intact.");
                    System.out.println("But you never find out what was in there and the unknowing of it all drives you mad.");
                }
            }
        } else if (action.equals("go to the house")) {
            System.out.println("As you approach the white house you see that the front door is still boarded up.");
            System.out.print("Break in or go around, trying to find another way in");
            action = userInput.nextLine();

            if (action.equals("break in")) {
                System.out.println("You start pulling at one of the boards on the front of the house");
                System.out.println("It pulls away suspiciously easy, you see the nails holding it are so rusted and aged they can' do their job anymore.");
                System.out.print("Try to open the door, just through the one plank hole, or pull the other planks off, fist.");
                action = userInput.nextLine();

                if (action.equals("try to open the door")) {
                    System.out.println("You push the door open.");
                    System.out.println("An shriveled old hand plunges out from the darkness to try and grab you, but the other planks on the door frame restrain it.");
                    System.out.println("You live, this time.");
                } else if (action.equals("pull the other planks off")) {
                    System.out.println("You pull all of the planks off and push the rickety door open.");
                    System.out.println("Something grabs you from the darkness of the house and you are never seen again.");
                }
            } else if (action.equals("go around")) {
                System.out.println("You make your way around to the back of the house and see an open doorway leading inside.");
                System.out.println("You think that this was much easier than pulling at the planks and head inside.");
                System.out.println("You enter into a long corridor, stretching endlessly, with but one door to your right.");
                System.out.print("Take the corridor or take the door");
                action = userInput.nextLine();

                if (action.equals("take the corridor")) {
                    System.out.println("You walk, and walk, and walk, ...forever.");
                } else if (action.equals("take the door")) {
                    System.out.println("You open the door with a creak and are met with horrors beyond human comprehension!");
                    System.out.println("You loose your grip with reality and fall into madness");
                }
            }
        }
    }
}
