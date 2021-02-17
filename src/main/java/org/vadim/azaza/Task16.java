package org.vadim.azaza;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args){
        Scanner lol;

        do {
            System.out.println("Enter number: ");
            lol = new Scanner(System.in);
        }while(!lol.hasNextInt());

        int num = lol.nextInt();
        lol.close();
        String str = Integer.toString(num);

        char[] symbols = str.toCharArray();
        int a, sum = 0, i;
        for(i = 0; i< symbols.length; i++){
            a = (int) symbols[i] - 48;
            sum += a;
        }
        System.out.println("Sum of digits of a number " + num + " is equal " + sum);
    }
}
