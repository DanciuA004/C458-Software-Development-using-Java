package com.mthree.java_classes_and_objects.state_capitals;

import java.util.HashMap;
import java.util.Map;

public class StateCapitals {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Alabama","Montgomery");
        map.put("Alaska","Juneau");
        map.put("Arizona","Phoenix");
        map.put("Arkansas","Little Rock");

        // Printing out the States
        System.out.println("\nSTATES: ");

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // Printing out the State Capitals
        System.out.println("\nCAPITALS: ");

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }

        // Printing out the State Capital Pairs
        System.out.println("\nSTATE/CAPITAL PAIRS: ");

        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
