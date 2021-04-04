package org.vadim.task31;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class Task31 {
    public static void main(String[] args){
        String fileName = "C:/Users/vadchek/Desktop/java/wp.txt";
        FileReader file;
        HashMap<Integer, HashMap<String, Integer>> textMap = new HashMap<>();

        try {
            file = new FileReader(fileName);
        }catch(FileNotFoundException e){
            System.out.println("File is not found.");
            return;
        }
        try(BufferedReader buf = new BufferedReader(file)) {
            String word = "";
            char symbol;
            int counter, reader = 0;

            while(reader != -1) {
                reader = buf.read();
                symbol = (char) reader;
                if (Character.isLetter(symbol) || symbol == '\'' || symbol == '-')
                    word += symbol;
                else {
                    if(word.length() > 0) {
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

                        //System.out.println(word + " " + word.length());
                    }
                    word = "";
                }
            }
            System.out.println(textMap.keySet());
            System.out.println(textMap.get(25));
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
