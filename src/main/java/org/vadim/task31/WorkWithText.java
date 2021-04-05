package org.vadim.task31;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WorkWithText {
    private  int counterOfWords; // счетчик слов в тексте
    private HashMap<Integer, HashMap<String, Integer>> textMap = new HashMap<>();  // ключ внутренней мапы - слово, значение - частота встречаемости в тексте
                                                                                    // ключ внешней мапы - количество букв в слове
    private  int counterOfLetters; // счетчик букв в тексте
    private HashMap<Character, Integer> letterMap = new HashMap<Character, Integer>();// ключ - буква, значение - частота встречаемости в тексте


    WorkWithText(String fileName){
        readWordsFromFileAndPutToMap(fileName);// заполнение мапы словами из текста
        readLettersFromFileAndPutToMap(fileName);//заполнение мапы буквами из текста
    }

    private void readLettersFromFileAndPutToMap(String fileName){
        FileReader file;

        try {                                           // открыть файл
            file = new FileReader(fileName);
        }catch(FileNotFoundException e){
            System.out.println("File is not found.");
            return;
        }

        try(BufferedReader buf = new BufferedReader(file)) {
            char symbol;
            int reader = 0;

            while(reader != -1) {
                reader = buf.read();
                symbol = (char) reader;
                if(Character.isLetter(symbol)) {
                    putLetterIntoMap(symbol);
                    counterOfLetters++;
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    private void readWordsFromFileAndPutToMap(String fileName){
        FileReader file;

        try {                                           // открыть файл
            file = new FileReader(fileName);
        }catch(FileNotFoundException e){
            System.out.println("File is not found.");
            return;
        }

        try(BufferedReader buf = new BufferedReader(file)) {  // посимвольное считывание из файла
            String word = "";
            char symbol;
            int reader = 0;

            while(reader != -1) {
                reader = buf.read();
                symbol = (char) reader;
                if (Character.isLetter(symbol) || symbol == '\'' || symbol == '-')  // составление слов из символов
                    word += symbol;
                else {
                    if(word.length() > 0 && !word.equals("-") && !word.equals("\'")) {
                        putWordIntoMap(word);          // запись слов в HashMap
                        counterOfWords++;
                    }
                    word = "";
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

    private void putLetterIntoMap(Character symbol){
        int counter;
        symbol = Character.toLowerCase(symbol);
       counter = letterMap.getOrDefault(symbol,0);
        letterMap.put(symbol, ++counter);
    }

    private void putWordIntoMap(String word){
        int counter;
        word = word.toLowerCase();
        if(textMap.get(word.length()) == null) {
            textMap.put(word.length(), new HashMap<>());
            textMap.get(word.length()).put(word, 1);
        }
        else if(textMap.get(word.length()).get(word) == null) {
            textMap.get(word.length()).put(word, 1);
        }
        else {
            counter = textMap.get(word.length()).get(word);
            textMap.get(word.length()).put(word, counter + 1);
        }
    }

    public int getCounterOfWords() {
        return counterOfWords;
    }

    public void printNLettersWords(int n){
        System.out.println("A group of " + n + " letter words: " + textMap.get(n).keySet());
    }

    public void topTenWords(){
        int number;
        String word = "";
        String[] words = new String[10];
        Integer[] numbers = new Integer[10];
        HashMap<Integer,HashMap<String,Integer>> txtMap = new HashMap<>(textMap);

        for(int i = 0; i < 10; i++) {
            number = 0;
            Set<Map.Entry<Integer, HashMap<String, Integer>>> outer = txtMap.entrySet();
            for (Map.Entry<Integer, HashMap<String, Integer>> iterator1 : outer) {
                Set<Map.Entry<String, Integer>> inner = iterator1.getValue().entrySet();
                for (Map.Entry<String, Integer> iterator2 : inner) {
                    if (iterator2.getValue() > number) {
                        number = iterator2.getValue();
                        word = iterator2.getKey();
                    }
                }
            }
            words[i] = word;
            numbers[i] = number;
            System.out.println((i + 1) + ". " + words[i] + "(" + numbers[i] + ")");
            txtMap.get(word.length()).remove(word);
        }

    }

    public void printLettersPercent(){
        Set<Map.Entry<Character, Integer>> letterSet = letterMap.entrySet();
        for(Map.Entry<Character, Integer> output : letterSet){
            System.out.print(output.getKey() + " " );
            System.out.printf("%.2f",((double)output.getValue()/counterOfLetters) * 100);
            System.out.println("%");
        }
    }
}
