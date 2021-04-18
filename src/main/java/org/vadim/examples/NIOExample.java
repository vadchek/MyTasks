package org.vadim.examples;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class NIOExample {
    public static void main(String[] args){
        int count;

        try(SeekableByteChannel fChan = Files.newByteChannel(Paths.get("C:/Users/vadchek/Desktop/lol.txt"))){
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do{
                count = fChan.read(mBuf);

                if(count != -1){
                    mBuf.rewind();
                    for(int i = 0; i < count; i++)
                        System.out.print((char)mBuf.get());
                }
            }while(count != -1);
        }catch(InvalidPathException invalidPathException){
            System.out.println("Path error " + invalidPathException);
        }catch (IOException ioException){
            System.out.println("Input/Output error " + ioException);
        }
    }
}
