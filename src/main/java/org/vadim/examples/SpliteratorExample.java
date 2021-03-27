package org.vadim.examples;

import java.util.*;

public class SpliteratorExample {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(5.0);
        vals.add(7.0);
        vals.add(4.0);
        vals.add(9.0);
        vals.add(13.0);

        Spliterator<Double> splitr = vals.spliterator();
        System.out.println("Array vals contains: ");
        while (splitr.tryAdvance((n) -> System.out.print(n + " "))) ;
        System.out.println();

        splitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;
        System.out.println();

        System.out.println("Array sqrs contains: ");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n) -> {System.out.printf("%.2f", n); System.out.print(" ");});
    }
}
