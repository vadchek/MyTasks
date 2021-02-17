package org.vadim.azaza;

public class Task3 {
    public static void main(String[] args){
        double d, x1, x2;
        double a = -4;
        double b = 0;
        double c = 1;

        if(a == 0) {
            System.out.println("Error: a = 0");
            System.out.println("It is not a quadratic equation");
        }
        else {
            /* write quadratic equation */
            System.out.print(a + "x^2 ");
            if(b > 0)
                System.out.print("+" + b + "x ");
            if(b < 0)
                System.out.print( b + "x ");
            if(c > 0)
                System.out.print("+" + c);
            if(c < 0)
                System.out.print(c);
            System.out.println(" =0");


            d = b * b - 4 * a * c;
            System.out.println("D = " + d);

            if (d < 0)
                System.out.println("No roots");
            else {
                if (d == 0) {
                    x1 = b * -1 / (2 * a);
                    System.out.println("x1 = " + x1);
                } else {
                    x1 = (b * -1 + Math.sqrt(d)) / (2 * a);
                    x2 = (b * -1 - Math.sqrt(d)) / (2 * a);
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }

            }
        }
    }
}
