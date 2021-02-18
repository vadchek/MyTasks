package org.vadim.azaza;

public class Task4 {
    public static void main(String[] args) {
        int num = 2876, i, k, dec, max;
        k = num;
        max = 0;
        dec = 1;
        for (dec = 1; dec <= num; dec *= 10) {}

        for (dec = dec/10; dec > 0; dec /= 10) {
            for (i = 0; k >= dec; i++)
                k = k - dec;

            if (i > max)
                max = i;
        }

        System.out.println("Of number " + num + " the largest digit is " + max);
    }
}
