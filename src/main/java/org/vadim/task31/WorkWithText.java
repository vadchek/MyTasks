package org.vadim.task31;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WorkWithText {
    private  int counterOfWords; // счетчик слов в тексте
    private HashMap<Integer, HashMap<String, Integer>> textMap = new HashMap<>();  // ключ внутренней мапы - слово, значение - частота встречаемости в тексте
                                                                                    // ключ внешней мапы - количество букв в слове
    private  int counterOfLetters; // счетчик букв в тексте
    private HashMap<Character, Integer> letterMap = new HashMap<Character, Integer>();


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
            System.out.println(letterMap);
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
            System.out.println(textMap.keySet());
            System.out.println(textMap.get(1));
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

    private void putLetterIntoMap(Character symbol){
        int counter;
        //word = word.toLowerCase();
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

    public int getCounterOfLetters() {
        return counterOfLetters;
    }

    public int getCounterOfWords() {
        return counterOfWords;
    }
}
