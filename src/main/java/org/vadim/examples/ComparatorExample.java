package org.vadim.examples;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args){
        //CompLastNames compLN = new CompLastNames();
        //Comparator<String> CompLastThenFirst = compLN.thenComparing(new CompThenByFirstName());
        //TreeMap<String, Double> tm = new TreeMap<>(CompLastThenFirst);

        Comparator<String> compLN = (aStr, bStr)-> aStr.substring(aStr.lastIndexOf(' ')).compareTo(bStr.substring(bStr.lastIndexOf(' ')));
        TreeMap<String, Double> tm = new TreeMap<>(compLN.thenComparing((aStr, bStr)-> aStr.compareTo(bStr)));

        tm.put("John Daw",3434.34);
        tm.put("Phil Jones",36.37);
        tm.put("Ann Jones",347.05);
        tm.put("Tom Brady",146.00);
        tm.put("Aoife McDoughal",-228.34);
        tm.put("Vasily Pupkin",13.98);
        tm.put("Andy Barnes",0.01);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for(Map.Entry<String, Double> lol : set){
            System.out.print(lol.getKey() + ": ");
            System.out.println(lol.getValue());
        }

        System.out.println();
        double balance = tm.get("Tom Brady");
        tm.put("Tom Brady", balance + 1000000);
        System.out.println("New balance of Tom Brady is: " + tm.get("Tom Brady"));
    }
}
