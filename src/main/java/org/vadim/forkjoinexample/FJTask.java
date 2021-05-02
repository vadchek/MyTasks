package org.vadim.forkjoinexample;

import java.util.concurrent.*;

public class FJTask extends RecursiveAction {
    double[] array;
    int start, end;
    int seqThreshold = 1000;

    public FJTask(double[] array, int start, int end){
        this.array = array;
        this.start = start;
        this.end = end;
    }

    protected void compute(){
        if((end-start) < seqThreshold){
            for(int i = start; i < end; i++){
                array[i] = Math.sqrt(array[i]);
            }
        }
        else{
            int middle = (start + end) / 2;
            invokeAll(new FJTask(array, start, middle),
                    new FJTask(array, middle, end));
        }
    }
}
