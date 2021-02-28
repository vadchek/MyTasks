package org.vadim.azaza;

public class Task30 {
    public static void main(String[] args){
        int[] array = new int[10];
        //int[] array = {1, 3, 5, 7};
        int sum = 0;
        for(int i = 0; i < array.length; i++)
            array[i] = (int)(100 * Math.random());

        for(int i : array)
            System.out.print(i + " ");
        System.out.println();

        lol:
        {
            for(int i : array){
                if(i % 2 == 0)
                    break lol;
                sum += i;
            }

            sum = 0;
            for(int i = 1; i < array.length - 1; i++)
                sum += array[i];
        }

        System.out.println("Answer is: " + sum);
    }
}
