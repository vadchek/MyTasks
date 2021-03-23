package org.vadim.examples;

public class Gen <T extends Number>{
    private T[] nums;

     Gen(T[] nums){
        this.nums = nums;
    }

    public double average(){
         double sum = 0;
         for(int i = 0; i < nums.length; i++)
             sum += nums[i].doubleValue();
         return sum/ nums.length;
    }
}
