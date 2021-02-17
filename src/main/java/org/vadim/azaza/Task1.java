package org.vadim.azaza;

public class Task1 {
    public static void main(String[] args){
        double height, length, width, V, S;
        height = 7.8;
        length = 10;
        width = 3.4;

        if(height <= 0 || length <= 0 || width <= 0 )
            System.out.println("Error: Invalid data");
        else {

            V = height * length * width;
            System.out.println("V = " + V);

            S = 2 * ((height * length) + (height * width) + (length * width));
            System.out.println("S = " + S);

            if (height > length) {
                if (height > width)
                    System.out.println("height = " + height + " is the largest metric");
                else
                    System.out.println("width = " + width + " is the largest metric");
            } else {
                if (length > width)
                    System.out.println("length = " + length + " is the largest metric");
                else
                    System.out.println("width = " + width + " is the largest metric");
            }
        }
    }
}
