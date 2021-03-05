package org.vadim.azaza;

public class Cat {
    String name;
    int age;
    int weight;
    int strength;

    Cat(){
        name = "Murzik";
        age = 6;
        weight = 5;
        strength = 146;
    }

    Cat(String name, int age, int weight, int strength){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    boolean fight(Cat obj){
        int me = strength * weight * 2 / (1 + Math.abs(7 - age));
        int enemy = obj.strength * obj.weight * 2 / (1 + Math.abs(7 - obj.age));
        return (me > enemy);
    }
}
