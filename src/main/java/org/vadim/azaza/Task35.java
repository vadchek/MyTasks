package org.vadim.azaza;

import java.io.*;

public class Task35 {
    public static void main(String[] args){
        String fileName = "C:/Users/vadchek/Desktop/java/wp.txt";
        FileReader reader;

        try {
            reader = new FileReader(fileName);
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("File is not found.");
            return;
        }

        try(BufferedReader bufferedReader = new BufferedReader(reader)){
            char symbol;
            int symbolReader = 0;
            int commaCounter = 0;

            while(symbolReader != -1){
                symbolReader = bufferedReader.read();
                symbol = (char)symbolReader;
                if(symbol == ','){
                    commaCounter++;
                }
            }
            System.out.println("Number of comma in text: " + commaCounter);
        }catch(IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
}
