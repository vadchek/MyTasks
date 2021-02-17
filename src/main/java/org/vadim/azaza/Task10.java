package org.vadim.azaza;

public class Task10 {
    public static void main(String[] args){
        int x1 = 0, x2 = 1, n;
        System.out.print(x1 + " " + x2 + " ");

        for(n = 2; n < 11; n++){
            x2 += x1;
            x1 = x2 - x1;
            System.out.print(x2 + " ");
        }
    }
}
