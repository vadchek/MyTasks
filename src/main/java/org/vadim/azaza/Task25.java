package org.vadim.azaza;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner sc;
        int n = 0;
        int counter = 0;
        do {
            sc = new Scanner(System.in);
            System.out.println("Enter size(even positive integer) of array:");
            if (sc.hasNextInt())
                n = sc.nextInt();
            if (n < 2 || n % 2 != 0)
                System.out.println("Invalid data!");
        } while (n < 2 || n % 2 != 0);

        int[] array = new int[n];

        for(int i = 0; i < n; i++)
            array[i] = (int)(11 * Math.random()) - 5;

        for(int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        for(int i = 0; i < n /2; i++)
            counter += Math.abs(array[i]);

        for(int i = n / 2; i < n; i++)
            counter -= Math.abs(array[i]);

        if(counter < 0)
            System.out.println("the sum of modules of elements of the RIGHT half of the array is GREATER");
        if(counter > 0)
            System.out.println("the sum of modules of elements of the LEFT half of the array is GREATER");
        if(counter == 0)
            System.out.println("the sum of modules of elements of the LEFT half and RIGHT half of the array is EQUAL");
    }
}
