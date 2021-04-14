package org.vadim.task33;

import java.io.*;

public class SplitConcatFile {
    void splitFile(){
        System.out.println("Enter name of source file(path + filename): ");
        File source = new File(readString());
        System.out.println("Enter name of output1 file(path + filename): ");
        File output1 = new File(readString());
        System.out.println("Enter name of output2 file(path + filename): ");
        File output2 = new File(readString());
        System.out.println("Enter size of output1: ");
        long sizeOfFirstPart = 0;
        boolean isNumber = true;
            do {
            try {
                sizeOfFirstPart = Long.parseLong(readString());
                isNumber = true;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Invalid data");
                isNumber = false;
            }
        }while(!isNumber);

        try(FileInputStream fileReader = new FileInputStream(source);
            FileOutputStream writerOutput1 = new FileOutputStream(output1);
            FileOutputStream writerOutput2 = new FileOutputStream(output2)){
            int bt;
            int byteCounter = 0;
            while ((bt = fileReader.read()) != -1) {
                if (byteCounter < sizeOfFirstPart) {
                    writerOutput1.write(bt);
                    byteCounter++;
                }
                else
                    writerOutput2.write(bt);
            }
        }catch(FileNotFoundException fileNotFoundException){
            System.out.println("File " + source + " is not found");
        }catch(IOException ioException){
            System.out.println("Input/Output error.");
        }
    }

    void concatFiles(){
        System.out.println("Enter name of source1 file(path + filename): ");
        File source1 = new File(readString());
        System.out.println("Enter name of source2 file(path + filename): ");
        File source2 = new File(readString());
        System.out.println("Enter name of output file(path + filename): ");
        File output = new File(readString());
        if(output.exists())
            output.delete();

        try(FileInputStream readerSource1 = new FileInputStream(source1);
            FileInputStream readerSource2 = new FileInputStream(source2);
            FileOutputStream writerOutput = new FileOutputStream(output, true)){

            int bt;
            while((bt = readerSource1.read()) != -1){
                writerOutput.write(bt);
            }
            while((bt = readerSource2.read()) != -1){
                writerOutput.write(bt);
            }

        }catch(FileNotFoundException fileNotFoundException){
            System.out.println("File is not found");
        }catch(IOException ioException){
            System.out.println("Input/Output error.");
        }
    }

     String readString() {
         InputStreamReader readFromKeyboard = new InputStreamReader(System.in);
        char c = ' ';
        String string = "";
        try {
            while ((c = (char) readFromKeyboard.read()) != '\n') {
                string += c;
            }
        }catch (IOException ioException){
            System.out.println("Input/Output error.");
        }
        return string;
    }
}
