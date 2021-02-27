package org.vadim.azaza;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        int[] array1 = createOriginalArray();
        System.out.println("Array1: ");
        for (int i : array1)
            System.out.print(i + " ");
        System.out.println();

        int[] array2 = createOriginalArray();
        System.out.println("Array2: ");
        for (int i : array2)
            System.out.print(i + " ");
        System.out.println();

        int[] sumArray = mySort(array1, array2);
        System.out.println("SumArray: ");
        for (int i : sumArray)
            System.out.print(i + " ");

    }

    static int scan() {
        Scanner sc;
        int n = -1;
        do {
            sc = new Scanner(System.in);
            System.out.println("Enter size of array:");
            if (sc.hasNextInt())
                n = sc.nextInt();
            if (n < 0)
                System.out.println("Invalid data!");
        } while (n < 0);
        return n;
    }

    static int[] createOriginalArray() {
        int[] array = new int[scan()];

        for (int i = 0; i < array.length; i++)
            array[i] = (int) (100 * Math.random());

        int buf;
        boolean f;
        for (int i = array.length - 1; i >= 1; i--) {
            f = true;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    buf = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = buf;
                    f = false;
                }
            }
            if (f)
                break;
        }

        return array;
    }

    static int[] mySort(int[] mass1, int[] mass2) {
        int[] myMass = new int[mass1.length + mass2.length];
        int m1 = 0, m2 = 0;

        if (mass1.length == 0)
            myMass = mass2;
        if (mass2.length == 0)
            myMass = mass1;

        if (mass1.length != 0 && mass2.length != 0) {

            for (int i = 0; i < myMass.length; i++) {

                if (mass1[m1] < mass2[m2]) {
                    myMass[i] = mass1[m1];
                    m1++;
                } else {
                    myMass[i] = mass2[m2];
                    m2++;
                }

                if (m1 == mass1.length) {
                    i++;
                    for (; i < myMass.length; i++) {
                        myMass[i] = mass2[m2];
                        m2++;
                    }
                }

                if (m2 == mass2.length) {
                    i++;
                    for (; i < myMass.length; i++) {
                        myMass[i] = mass1[m1];
                        m1++;
                    }
                }
            }
        }

        return myMass;
    }

}
