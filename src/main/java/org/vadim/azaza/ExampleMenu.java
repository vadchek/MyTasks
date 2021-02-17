package org.vadim.azaza;

public class ExampleMenu {
    public static void main(String[] args)
            throws java.io.IOException {
            char choice;

            do {
                System.out.println("Operator help:");
                System.out.println("    1. if");
                System.out.println("    2. switch");
                System.out.println("    3. while");
                System.out.println("    4. do-while");
                System.out.println("    5. for \n");
                System.out.println("Choose your destiny!");
                choice = (char) System.in.read();
            } while (choice < '1' || choice > '5');
            

            switch (choice) {
                case '1':
                    System.out.println("    1. if \n");
                    System.out.println(" if (condition) operator;");
                    System.out.println(" else operator");
                    break;
                case '2':
                    System.out.println("    2. switch \n");
                    System.out.println(" switch (variable) {");
                    System.out.println(" case: const ");
                    System.out.println(" operators;");
                    System.out.println(" break;");
                    System.out.println(" //...");
                    System.out.println(" }");
                    break;
                case '3':
                    System.out.println("    3. while \n");
                    System.out.println(" while (condition) operator;");
                    break;
                case '4':
                    System.out.println("    4. do-while \n");
                    System.out.println(" do { ");
                    System.out.println(" operator;");
                    System.out.println(" } while (condition);");
                    break;
                case '5':
                    System.out.println("    5. for \n");
                    System.out.println(" for (initialization; condition; iterator)");
                    System.out.println(" operator;");
                    break;

            }

        }
    }

