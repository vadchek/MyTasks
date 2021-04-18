package org.vadim.examples;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.nio.file.*;

public class NIOWriteInFile {
    public static void main(String[] args){
        int count = 0;

        try(FileChannel inputFileChannel = (FileChannel)Files.newByteChannel(Paths.get("C:/Users/vadchek/Desktop/lol.txt"), StandardOpenOption.READ);
            FileChannel outputFileChannel = (FileChannel)Files.newByteChannel(Paths.get("C:/Users/vadchek/Desktop/kek.txt"), StandardOpenOption.WRITE)){

            CharBuffer receive = CharBuffer.allocate(10);
            CharBuffer transmit = CharBuffer.allocate(10);
            do{
                //count = inputFileChannel.read(receive);

                if(count != -1){
                    receive.rewind();
                    for(int i = 0; i < count; i++)
                        System.out.print(receive.get());
                }
            }while(count != -1);
        }catch(InvalidPathException invalidPathException){
            System.out.println("Path error " + invalidPathException);
        }catch(IOException ioException){
            System.out.println("Input/Output error " + ioException);
        }
    }
}
