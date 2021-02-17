package org.vadim.azaza;

public class Task2 {
    public static void main(String[] args){
        double m, n;
        m = 7;
        n = 15;

        if(Math.abs(m -10) > Math.abs(n -10))
            System.out.println(n);
        else
            System.out.println(m);

        if(Math.abs(m -10) == Math.abs(n -10)){
            System.out.println(n);
        }
    }
}
