package org.vadim.azaza;

public class Task8 {
    public static void main(String[] args){
        int a, b, c, d, e, f;

        a = 5;
        b = 155;

        if(a > b)
            System.out.println("Error");

        c = a + (int) ((b - a) * Math.random());

        d = 25;
        e = 100;

        if(d >= e)
            System.out.println("Error");

        if(c > d && c < e) {
            System.out.print("Number ");
            System.out.print(c);
            System.out.println(" is into (" + d + "," + e + ")");
        }
        else{
            System.out.print("Number ");
            System.out.print(c);
            System.out.println(" is outside of (" + d + "," + e + ")");
        }
    }
}
