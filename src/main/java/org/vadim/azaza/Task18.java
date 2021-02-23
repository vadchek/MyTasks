package org.vadim.azaza;

public class Task18 {
    public static void main(String[] args){
        EnterNumber son = new EnterNumber();
        int a = son.enterNum(0,24);
        int b = son.enterNum(a,24);
        int c = son.enterNum(0,24);
        son.closeScan();

        if(c < a)
            System.out.println("Lack of sleep!");
        if(c > b)
            System.out.println("Oversleep!");
        if(c >= a && c <= b)
            System.out.println("This is normal");

    }
}
