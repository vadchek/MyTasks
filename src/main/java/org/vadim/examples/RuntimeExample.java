package org.vadim.examples;

public class RuntimeExample {
    public static void main(String[] args){
        Runtime prog = Runtime.getRuntime();
        Process proc = null;
        long start = 0, stop =0;

        try{
            start = System.currentTimeMillis();
            proc = prog.exec("Notepad");
            proc.waitFor();
            stop = System.currentTimeMillis();
        }catch(Exception exception){
            System.out.println("Ошибка запуска Notepad.");
        }

        System.out.println("Время работы в Notepad: " + (stop - start) + "мс");
    }
}
