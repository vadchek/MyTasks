package org.vadim.azaza;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args){
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.print("Divisors of " + num + ": ");
        for(int i = 1; i*i <= num; i++){
            if(num % i == 0){
                int j = num / i;
                if(i != j)
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            }
        }
    }
}
