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


    void calculation() {
        double a = enterNum();
        double b = enterNum();
        String oper = enterOperation();
        double c = 0;
        boolean bool = false;

        do {
            switch (oper) {
                case "+":
                    c = a + b;
                    System.out.println(a + " " + oper + " " + b + " = " + c);
                    break;
                case "-":
                    c = a - b;
                    System.out.println(a + " " + oper + " " + b + " = " + c);
                    break;
                case "*":
                    c = a * b;
                    System.out.println(a + " " + oper + " " + b + " = " + c);
                    break;
                case "/":
                    if (b != 0) {
                        c = a / b;
                        System.out.println(a + " " + oper + " " + b + " = " + c);
                    } else
                        System.out.println("Division by 0!");
                    break;
                case "mod":
                    if (b != 0) {
                        c = a % b;
                        System.out.println(a + " " + oper + " " + b + " = " + c);
                    } else
                        System.out.println("Division by 0!");
                    break;
                case "pov":
                    c = Math.pow(a, b);
                    System.out.println(a + " " + oper + " " + b + " = " + c);
                    break;
                case "div":
                    if (b != 0) {
                        c = (int) (a / b);
                        System.out.println(a + " " + oper + " " + b + " = " + c);
                    } else
                        System.out.println("Division by 0!");
                    break;
                default:
                    System.out.println("Incorrect operation!");
                    oper = enterOperation();
                    bool = true;
            }
        } while (bool);

    }
}

