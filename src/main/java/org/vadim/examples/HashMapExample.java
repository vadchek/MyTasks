package org.vadim.examples;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<String, Double> customers = new HashMap<>();
        customers.put("John Daw",3434.34);
        customers.put("Ann Jones",347.05);
        customers.put("Tom Brady",146.00);
        customers.put("Aoife McDoughal",-228.34);
        customers.put("Vasily Pupkin",13.98);

        Set<Map.Entry<String, Double>> set = customers.entrySet();
        for(Map.Entry<String, Double> lol : set){
            System.out.print(lol.getKey() + ": ");
            System.out.println(lol.getValue());
        }

        System.out.println();
        double balance = customers.get("Tom Brady");
        customers.put("Tom Brady", balance + 1000000);
        System.out.println("New balance of Tom Brady is: " + customers.get("Tom Brady"));
    }
}
