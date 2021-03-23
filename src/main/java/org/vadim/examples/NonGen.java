package org.vadim.examples;

public class NonGen {

    public NonGen(){
        System.out.println("ololo");
    }

    public <T extends Comparable<T>> boolean equality(T obj1, T obj2){
        if (obj1.equals(obj2))
            return true;
        return false;
    }
}
