package org.vadim.azaza;

public class Task9 {
    public static void main(String[] args){
        int n = (int)(28800 * Math.random());
        int m = n/3600;

        System.out.println(n);

        if (m == 0)
            System.out.println("Less than an hour left. If you leave before you see zero, I will find you and kick your ass!!!");
        else if (m == 3)
                System.out.println(m + " hours left. It's time for dinner! But I watching you, little motherfucker!!!");
            else
                System.out.println(m + " hours left. Stop looking at watch, cheap bastard! Work harder.");

    }
}
