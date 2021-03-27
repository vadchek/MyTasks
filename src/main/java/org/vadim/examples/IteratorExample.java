package org.vadim.examples;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("lol");
        al.add("kek");
        al.add("azaza");
        al.add("trololo");

        Iterator<String> itr = al.iterator();
        System.out.println("Array contents:");
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        ListIterator<String> litr = al.listIterator();
        while(litr.hasNext()){
            litr.set(litr.next() + "++");
        }

        System.out.println("Array contents after changes:");
        while(litr.hasPrevious()){
            System.out.print(litr.previous() + " ");
        }
    }
}
