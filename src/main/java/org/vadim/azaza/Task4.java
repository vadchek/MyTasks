package org.vadim.azaza;

public class Task4 {
    public static void main(String[] args){
        int num = 307, i, j, k;
        k = num;

        for(i = 0; k >= 100; i++)
            k = k - 100;

        for(j = 0; k >= 10; j++)
            k = k - 10;

        if(i > j){
            if(i > k)
                System.out.println("Of number " + num + " the largest digit is " + i);
            else
                System.out.println("Of number " + num + " the largest digit is " + k);
        }
        else{
            if(j > k)
                System.out.println("Of number " + num + " the largest digit is " + j);
            else
                System.out.println("Of number " + num + " the largest digit is " + k);
        }

    }
}
