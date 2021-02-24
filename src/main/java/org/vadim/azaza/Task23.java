package org.vadim.azaza;

public class Task23 {
    public static void main(String[] args) {
        double j = 0, k = 0;
        int mass1[] = new int[5];
        int mass2[] = new int[5];

        for (int i = 0; i < 5; i++) {
            mass1[i] = (int) (6 * Math.random());
            j += mass1[i];
        }
        double m1 = j / mass1.length;

        for (int i = 0; i < 5; i++) {
            mass2[i] = (int) (6 * Math.random());
            k += mass2[i];
        }
        double m2 = k / mass2.length;

        for (int i : mass1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(m1);

        for (int i : mass2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(m2);

        if (m1 > m2)
            System.out.println("Arithmetic mean of mass1 elements is greater");
        if (m1 < m2)
            System.out.println("Arithmetic mean of mass2 elements is greater");
        if (m1 == m2)
            System.out.println("Arithmetic mean of mass1 elements is equal arithmetic mean of mass2");
    }
}
