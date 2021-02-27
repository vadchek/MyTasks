package org.vadim.azaza;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements separated by space and press \"ENTER\"");
        String str = sc.nextLine();
        sc.close();
        String [] elements = str.split(" ");

        double[] array = new double[elements.length];
        for(int i = 0; i < elements.length; i++)
            array[i] = Double.parseDouble(elements[i]);

        double max = array[0];
        double min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max)
                max = array[i];
            if(array[i]<min)
                min = array[i];
        }

        System.out.println("Array:");
        for(double x : array)
            System.out.print(x + " ");
        System.out.println();
        System.out.println("MAX element: " + max);
        System.out.println("MIN element: " + min);
    }
}
