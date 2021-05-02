package org.vadim.forkjoinexample;

import java.util.concurrent.*;

public class FJExample {
    public static void main(String[] args){
        long beginT, endT;
        double[] nums = new double[1000000];      // create array
        for(int i = 0; i < nums.length; i++)
            nums[i] = i;

        ForkJoinPool pool = new ForkJoinPool();
        FJTask transform = new FJTask(nums, 0 , nums.length);

        beginT = System.nanoTime();
        pool.invoke(transform);
        endT =System.nanoTime();

        for(int i = 0; i < 10; i++)
            System.out.printf(" %.2f", nums[i]);
        System.out.println();
        System.out.println(endT - beginT);
        System.out.println(pool.getParallelism());
    }
}
