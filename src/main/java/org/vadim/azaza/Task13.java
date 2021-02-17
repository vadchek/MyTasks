package org.vadim.azaza;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args){
        System.out.println("enter DNA:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] symbols = str.toCharArray();
        System.out.println(symbols);

        System.out.print(symbols[0]);
        int n = 1;
        for(int i = 1; i < symbols.length; i++){

            if(symbols[i] == symbols[i-1])
                n++;
            else{
                System.out.print(n);
                System.out.print(symbols[i]);
                n = 1;
            }
        }
        System.out.print(n);
        sc.close();
    }
}
