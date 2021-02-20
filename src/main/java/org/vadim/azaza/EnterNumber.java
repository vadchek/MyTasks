package org.vadim.azaza;

import java.util.Scanner;

public class EnterNumber {
    Scanner sc;

    int enterNum(int x) {
        int y = 0;
        do {
            sc = new Scanner(System.in);
            System.out.println("Enter number (" + x + " <= number <= 10): ");
            if (!sc.hasNextInt())
                System.out.println("Invalid data!");
            else {
                y = sc.nextInt();
                if (y < x || y > 10)
                    System.out.println("Invalid data!");
            }
        } while (y < x || y > 10);

        return y;
    }

    void closeScan() {
        sc.close();
    }
}
