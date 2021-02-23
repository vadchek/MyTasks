package org.vadim.azaza;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args){
        Scanner num;
        int n, sum = 0, res = 0;

        do {

            do {
                System.out.println("Enter number:");
                num = new Scanner(System.in);
            }while(num.hasNextInt() == false);

            n = num.nextInt();
            sum += n;
            res += n * n;

        }while(sum!=0);

        System.out.println(res);
    }
}
