package org.vadim.azaza;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = num.nextInt();
        int i, j;
        for(i = 1, j = 1; i < n; i++, j *= i){
            ;
        }
        System.out.println(n + "! = " + j );
        num.close();
    }
}
