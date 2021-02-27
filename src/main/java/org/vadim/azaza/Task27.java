package org.vadim.azaza;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args){
        Scanner sc;
        int n = -1;

        do{
            sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            if(sc.hasNextInt())
                n = sc.nextInt();
            if(n < 0)
                System.out.println("Invalid data!");
        }while(n < 0);

        sc.close();

        int[] array = new int[n / 3];
        int j = 0;

        for (int i = n; i > 0; i--){
            if(i % 3 == 0){
                array[j] = i;
                j++;
            }
        }

        System.out.println("Array: ");
        for(int i : array)
            System.out.print( i + " ");

    }
}
