package org.vadim.azaza;

public class Task22 {
    public static void main(String[] args) {
        int[] massiv = new int[15];
        int x = 0;
        for (int i = 0; i < 15; i++) {
            massiv[i] = (int) (10 * Math.random());
        }

        for (int i : massiv) {
            System.out.print(i + " ");
            if (i % 2 == 0)
                x++;
        }
        System.out.println();
        System.out.print("Number of even elements: " + x);
    }
}
