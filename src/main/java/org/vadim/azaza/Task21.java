package org.vadim.azaza;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc;

        do {
            sc = new Scanner(System.in);
            System.out.println("Enter number of elements: ");

            if (sc.hasNextInt())
                n = sc.nextInt();

            if (n < 1)
                System.out.println("Invalid data!");
        } while (n < 1);

        lol:
        for (int i = 1; ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                if (--n == 0)
                    break lol;
            }
        }
    }
}
