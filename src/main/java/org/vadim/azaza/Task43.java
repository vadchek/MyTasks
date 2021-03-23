package org.vadim.azaza;

import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       Palindrom lol = new Palindrom(str);
       if(lol.isPalindrom())
           System.out.println("String: \n" + str + "\nis a palindrom");
       else
           System.out.println("String: \n" + str + "\nis not a palindrom");
    }
}
