package org.vadim.task31;

public class Task31 {
    public static void main(String[] args){
        String fileName = "C:/Users/vadchek/Desktop/java/wp.txt";

        WorkWithText textProcessor = new WorkWithText(fileName);
        System.out.println(textProcessor.getCounterOfWords());
    }
}
