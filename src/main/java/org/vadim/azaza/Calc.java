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
        double c;
        boolean bool = false;

        do {
            switch (oper) {
                case "+":
                    Addition lol = new Addition();
                    c = lol.execute(a, b);
                    System.out.println(a + " " + oper + " " + b + " = " + c);
                    break;
                case "-":
                    Subtraction kek = new Subtraction();
                    c = kek.execute(a, b);
                    System.out.println(a + " " + oper + " " + b + " = " + c);
                    break;
                case "*":
                    Multiplication ololo = new Multiplication();
                    c = ololo.execute(a, b);
                    System.out.println(a + " " + oper + " " + b + " = " + c);
                    break;
                case "/":
                    if (b != 0) {
                        Division trololo = new Division();
                        c = trololo.execute(a, b);
                        System.out.println(a + " " + oper + " " + b + " = " + c);
                    } else
                        System.out.println("Division by 0!");
                    break;
                case "mod":
                    if (b != 0) {
                        Mod azaza = new Mod();
                        c = azaza.execute(a, b);
                        System.out.println(a + " " + oper + " " + b + " = " + c);
                    } else
                        System.out.println("Division by 0!");
                    break;
                case "pov":
                    Pov omg = new Pov();
                    c = omg.execute(a, b);
                    System.out.println(a + " " + oper + " " + b + " = " + c);
                    break;
                case "div":
                    if (b != 0) {
                        Div wtf = new Div();
                        c = wtf.execute(a, b);
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

