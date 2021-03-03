package org.vadim.azaza;

import java.util.Scanner;

public class Task19 {
    // Now with oeration classes!
    public static void main(String[] args){
        Calc calc = new Calc();
        Scanner lol = new Scanner(System.in);
        System.out.println("Enter \"exit\" if you want exit, or press Enter to calculate:");
        String ololo = lol.nextLine();
        while(!ololo.equals("exit")) {
            calc.calculation();
            System.out.println("Enter \"exit\" if you want exit, or press Enter to calculate:");
            ololo = lol.nextLine();
        }
    }
}
