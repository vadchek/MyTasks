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
            String str;
            String substring = "war and peace";
            int counter = 0;
            while((str = buf.readLine()) != null){
                str = str.toLowerCase();
                if (str.contains(substring))
                    counter++;
            }
            System.out.println(counter);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
