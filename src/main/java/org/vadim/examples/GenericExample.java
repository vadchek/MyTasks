package org.vadim.examples;

public class GenericExample {
    public static void main(String[] args){
        Integer[] nums = {1,-80,0,4,95};
        Gen<Integer> lol = new Gen<>(nums);
        System.out.println(lol.average());
        NonGen ololo = new NonGen();
        if(ololo.equality(ololo.equality(1, 2), ololo.equality("lol", "kek")))
            System.out.println("azaza!");
    }
}
