package org.vadim.azaza;

public class Task5 {
    public static void main(String[] args){
        int a = 3, b = 2, c = 1, x;

        System.out.println(" Original sequence a, b, c: " + a + ", " + b + ", " + c);

        if(a > b){
            x = a;
            a = b;
            b = x;
        }

        if(b > c){
            x = b;
            b = c;
            c = x;

            if(a > b){
                x = a;
                a = b;
                b = x;
            }
        }

        System.out.println("Now sequence a, b, c: " + a + ", " + b + ", " + c);
    }
}