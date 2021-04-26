package org.vadim.examples;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class SchildtExample {
    public static void main(String[] args){
        Path file = Paths.get("C:/Users/vadchek/Desktop/lol.txt");
        int count;

        try(ByteChannel channel = Files.newByteChannel(file)){
            ByteBuffer buffer = ByteBuffer.allocate(1000);
            CharBuffer result;
            do{
                count = channel.read(buffer);
                buffer.rewind();
                result = StandardCharsets.UTF_8.decode(buffer);
                int r = result.length();
                if(count != -1){
                    result.rewind();
                    buffer.rewind();
                    for(int i = 0; i < r; i++)
                        System.out.print(result.get());
                }
            }while(count != -1);
        }catch(InvalidPathException invalidPathException){
            System.out.println("Path error " + invalidPathException);
        }catch(IOException ioException){
            System.out.println("I/O error " + ioException);
        }
    }
}