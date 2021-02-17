package org.vadim.azaza;

public class Task6 {
    public static void main(String[] args){
        int head, tail, i, j, k, hs, ts, n;
        n = 0;

        for(head = 0; head < 1000; head++){
            k = head;

            for(i = 0; k >= 100; i++)
                k -=  100;

            for(j = 0; k >= 10; j++)
                k -=  10;

             hs = i + j + k;

            for(tail = 0; tail < 1000; tail++) {
                k = tail;

                for (i = 0; k >= 100; i++)
                    k -=  100;

                for (j = 0; k >= 10; j++)
                    k -=  10;

                ts = i + j + k;

                if(hs == ts)
                    n++;
            }
        }
        System.out.println(n-1);
    }
}
