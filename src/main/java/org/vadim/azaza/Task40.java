package org.vadim.azaza;

import java.util.*;
import java.io.*;

public class Task40 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter sequence: ");
        char c;
        String str = "";
        Integer number;

        try {
            do {
                c = (char) reader.read();
                if (Character.isDigit(c)) {
                    str += c;
                }
                if (c == ' ' && str.length() > 0) {
                    number = Integer.parseInt(str);
                    list.add(number);
                    str = "";
                }
                if (c == '\n' && str.length() > 0) {
                    number = Integer.parseInt(str);
                    list.add(number);
                }

            } while (c != '\n');
        } catch (Exception e) {
            System.out.println("LOL, KEK!");
        }

        //System.out.print(list);

        for (int i = 0; i < list.size(); i++)
            list.remove(i);

        //System.out.print(list);
        //System.out.println();

        for (int i = list.size(); i > 0; i--) {
            System.out.print(list.get(i - 1) + " ");
        }
    }
}
