package org.vadim.task33;

public class Task33 {
    public static void main(String[] args){
        SplitConcatFile fileHandler = new SplitConcatFile();
        System.out.println("Hello!");
        String choice = "";
        do{
            System.out.println("Press 1 + ENTER if you want to split file into two parts");
            System.out.println("Press 2 + ENTER if you want to concat two files");
            System.out.println("Press q + ENTER to exit");
            choice = fileHandler.readString();
            switch(choice){
                case "1":
                    fileHandler.splitFile();
                    break;
                case "2":
                    fileHandler.concatFiles();
                    break;
                case "q":
                    System.out.println("Goodbye");
                    break;
            }
        }while(!choice.equals("q"));
    }

}
