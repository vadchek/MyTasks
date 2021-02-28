package org.vadim.azaza;

public class Task29 {
    public static void main(String[] args){
        int a, b;
        String str, str1;
        String[] task = new String[15];
        int counter = 1;

        task[0] = ((int) (8 * Math.random()) + 2) + " * " + ((int) (8 * Math.random()) + 2) + " =";

        do {
            a = (int) (8 * Math.random()) + 2;
            b = (int) (8 * Math.random()) + 2;
            str = a + " * " + b + " =";
            str1 = b + " * " + a + " =";

            lol:
            {
                for (int i = 0; i < counter; i++) {
                    if (task[i].equals(str) || task[i].equals(str1))
                        break lol;
                }

                task[counter] = str;
                counter++;
            }
        }while(counter != task.length);

        for(int i = 0; i < task.length; i++)
            System.out.println((i + 1) + ") " + task[i]);
    }
}
