package org.vadim.azaza;

public class Task37 {
    public static void main(String[] args){
        Cat lika = new Cat("Lika",3,4,80);
        Cat austin = new Cat("Austin",5,6,120);
        Cat sanya = new Cat("Sanya", 2, 4, 90);
        Cat murzik = new Cat();

        if(murzik.fight(austin))
            System.out.println(murzik.name + " WIN!");
        else
            System.out.println(murzik.name + " Lose");
    }
}
