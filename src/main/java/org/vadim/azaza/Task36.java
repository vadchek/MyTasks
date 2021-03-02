package org.vadim.azaza;

public class Task36 {
    public static void main(String[] args){
        Pupil pupil = new Pupil(9959);
        String[] ex = {"mathematics", "biology", "chemistry", "physics", "geography", "computer science"};
        int [] marks = {3, 4, 5, 3, 4, 2};
        pupil.setExams(ex,marks);
        System.out.println(pupil);
    }
}
