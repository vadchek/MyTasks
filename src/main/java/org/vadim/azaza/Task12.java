package org.vadim.azaza;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите неотрицательное число : ");

        if(sc.hasNextInt()) {
            int number = sc.nextInt();

            switch (number % 10) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("В аудитории " + number + " программистов.");
                    break;
                case 1:
                    if (number % 100 == 11)
                        System.out.println("В аудитории " + number + " программистов.");
                    else
                        System.out.println("В аудитории " + number + " программист.");
                    break;
                case 2:
                case 3:
                case 4:
                    if (number % 100 > 11 && number % 100 < 15)
                        System.out.println("В аудитории " + number + " программистов.");
                    else
                        System.out.println("В аудитории " + number + " программиста.");
                    break;
            }
        }
        else
            System.out.println("Некорректные данные.");

        sc.close();
    }
}
