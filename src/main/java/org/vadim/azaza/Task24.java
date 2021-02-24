package org.vadim.azaza;

public class Task24 {
    public static void main(String[] args) {
        int n = 0;
        int mass1[] = new int[10];
        int mass2[] = new int[10];

        for (int i = 0; i < 10; i++) {
            mass1[i] = 1 + (int) (9 * Math.random());
        }

        for (int i = 0; i < 10; i++) {
            mass2[i] = 1 + (int) (9 * Math.random());
        }

        double mass3[] = new double[10];
        for (int i = 0; i < 10; i++) {
            mass3[i] = (double) mass1[i] / mass2[i];
            if (mass3[i] % 1 == 0)
                n++;
        }

        System.out.print("mass1: ");
        for (int i : mass1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("mass2: ");
        for (int i : mass2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("mass3: ");
        for (double i : mass3) {
            System.out.printf("%.2f", i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("There are " + n + " integer elements in mass3");
    }
}
