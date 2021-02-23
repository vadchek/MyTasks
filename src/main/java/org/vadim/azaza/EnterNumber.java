package org.vadim.azaza;

import java.util.Scanner;

public class EnterNumber {
    Scanner sc;

    int enterNum(int x1, int x2) {
        int y = 0;
        do {
            sc = new Scanner(System.in);
            System.out.println("Enter number (" + x1 + " <= number <= " + x2 + "): ");
            if (!sc.hasNextInt())
                System.out.println("Invalid data!");
            else {
                y = sc.nextInt();
                if (y < x1 || y > x2)
                    System.out.println("Invalid data!");
            }
        } while (y < x1 || y > x2);

        return y;
    }

    void closeScan() {
        sc.close();
    }
}
