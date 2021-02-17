package org.vadim.azaza;

public class Task11 {
    public static void main(String[] args){
        int hours, minutes, n, invhours, i, j;
        n = 0;

        for(hours = 0; hours < 24; hours++){

            j = hours;
            for(i = 0; j >= 10; i++){
                j -= 10;
            }

            invhours = j * 10 + i;

            for(minutes = 0; minutes < 60; minutes++){
                    if(minutes == invhours) {
                        n++;
                        System.out.println(hours + " " + minutes);
                        break;
                    }
                }
        }
        System.out.println(n);
    }
}
