package org.vadim.task31;

public class Task31 {
    public static void main(String[] args){
        String fileName = "C:/Users/vadchek/Desktop/java/wp.txt";

        WorkWithText textProcessor = new WorkWithText(fileName);

        System.out.println("The number of words in the text: " + textProcessor.getCounterOfWords());
        System.out.println();
        textProcessor.printNLettersWords(7);
        System.out.println();
        System.out.println("Top ten words: " );
        textProcessor.topTenWords();
        System.out.println();
        textProcessor.printLettersPercent();
    }
}
