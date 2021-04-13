package org.vadim.azaza;

import java.io.*;
import java.util.Scanner;

public class Task32 {
    public static void main(String[] args){
        //original  C:/Users/vadchek/Desktop/lol.txt
        //copy  C:/Users/vadchek/Desktop/kek.txt
        long byteCounter = 0;
        FileInputStream originalFile = null;
        FileOutputStream copyFile = null;

        try {
            boolean fileIsNotFound;

            do {
                try {
                    originalFile = new FileInputStream(setFileName());
                    fileIsNotFound = false;
                } catch (FileNotFoundException notFound) {
                    System.out.println("File is not found!");
                    fileIsNotFound = true;
                }
            }while(fileIsNotFound);

            do {
                try {
                    copyFile = new FileOutputStream(setFileName());
                    fileIsNotFound = false;
                } catch (FileNotFoundException notFound) {
                    System.out.println("File is not found!");
                    fileIsNotFound = true;
                }
            }while(fileIsNotFound);

            byteCounter = originalFile.transferTo(copyFile);

        }catch(IOException exception){
            System.out.println("Input-Output error.");
        }


        try {
            originalFile.close();
        }catch (IOException ioException){
            System.out.println("Close error.");
        }

        try {
            copyFile.close();
        }catch (IOException ioException){
            System.out.println("Close error.");
        }

        System.out.println("Size of copied data: " + byteCounter + " bytes.");
    }

    static String setFileName(){
        System.out.println("Enter name of file (Format: path to file + fileName.txt!!!): ");
        Scanner file = new Scanner(System.in);
        return file.nextLine();
    }
}
