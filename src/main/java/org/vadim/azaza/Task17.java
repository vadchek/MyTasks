package org.vadim.azaza;

public class Task17 {
    public static void main(String[] args) {
        int a, b, c, d, i, j;

        EnterNumber en = new EnterNumber();
        a = en.enterNum(1);
        b = en.enterNum(a);
        c = en.enterNum(1);
        d = en.enterNum(c);
        en.closeScan();

        System.out.print("*\t");
        for (i = c; i <= d; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (i = a; i <= b; i++) {
            System.out.print(i + "\t");
            for (j = c; j <= d; j++)
                System.out.print(i * j + "\t");
            System.out.println();
        }

    }
}
