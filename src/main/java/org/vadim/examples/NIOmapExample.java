package org.vadim.examples;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class NIOmapExample {
    public static void main(String[] args){
        try(FileChannel fChan = (FileChannel)Files.newByteChannel(Paths.get("C:/Users/vadchek/Desktop/lol.txt"))){
            long size = fChan.size();
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, size);
            for(int i = 0; i < size; i++)
                System.out.print((char)mBuf.get());
        }catch(InvalidPathException invalidPathException){
            System.out.println("Path error " + invalidPathException);
        }catch(IOException ioException){
            System.out.println("Input/Output error " + ioException);
        }
    }
}
