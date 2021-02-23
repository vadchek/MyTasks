package org.vadim.azaza;

import java.util.Scanner;

public class Calc {
    Scanner sc;

    double enterNum() {
        double y = 0;
        boolean bool = true;
        do {
            sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            if (!sc.hasNextDouble())
                System.out.println("Invalid data!");
            else {
                y = sc.nextDouble();
                bool = false;
            }
        }
        while (bool);

        return y;
    }


    String enterOperation() {
        String op;
        sc = new Scanner(System.in);
        System.out.println("Enter operation: ");
        op = sc.nextLine();
        return op;
    }


    void calculation(){
        double a = enterNum();
        double b = enterNum();
        String oper = enterOperation();
        double c = 0;
        boolean bool = false;

        do {
            switch (oper) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "*":
                    c = a * b;
                    break;
                case "/":
                    c = a / b;
                    break;
                case "mod":
                    c = a % b;
                    break;
                case "pov":
                    c = Math.pow(a, b);
                    break;
                case "div":
                    c = (int) (a / b);
                    break;
                default:
                    System.out.println("Incorrect operation!");
                    oper = enterOperation();
                    bool = true;
            }
        }while(bool);

        System.out.println(a + " " + oper + " " + b + " = " + c);
    }
}

