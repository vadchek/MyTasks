package org.vadim.azaza;

import java.io.*;

public class Task31 {
    public static void main(String[] args){
        String fileName = "C:/Users/vadchek/Desktop/java/wp.txt";
        FileReader file;
        try {
            file = new FileReader(fileName);
        }catch(FileNotFoundException e){
            System.out.println("File is not found.");
            return;
        }
        try(BufferedReader buf = new BufferedReader(file)) {
            String word = "";
            char symbol;

            for(int iterator = 0; iterator < 200; iterator++) {
                symbol = (char) (buf.read());
                if (Character.isLetter(symbol) || symbol == '\'')
                    word += symbol;
                else {
                    word = word.toLowerCase();
                    if(word.length() > 0)
                        System.out.println(word + " " + word.length());
                    word = "";
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
