package org.vadim.azaza;

import java.io.*;

public class Task32 {
    public static void main(String[] args){
        String original = "C:/Users/vadchek/Desktop/lol.txt";
        String copy = "C:/Users/vadchek/Desktop/kek.txt";
        int byteCounter = 0;
        try {
            FileInputStream originalFile = new FileInputStream(original);
            FileOutputStream copyFile = new FileOutputStream(copy);
            int i;

            do{
                i = originalFile.read();
                if(i != -1) {
                    copyFile.write(i);
                    byteCounter++;
                }
            }while(i != -1);

        }catch(IOException exception){
            System.out.println("Input-Output error.");
        }
        System.out.println("Size of copied data: " + byteCounter + " bytes.");
    }
}
