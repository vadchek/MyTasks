package org.vadim.azaza;

public class Pupil {
    int id;
    String[] ExamResult;

    Pupil(int n){
        id = n;
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < ExamResult.length; i++)
            str = str + ExamResult[i] + "\n";
        return "Student: " + id + "\n" + str;
    }

    void setExams(String[] ex, int[] marks){
        ExamResult = new String[ex.length];
        ExamResult lol = new ExamResult();
        for(int i = 0; i < ex.length; i++)
            ExamResult[i] = lol.result(ex[i], marks[i]);
    }

    class ExamResult{
        String ex;
        int mark;
        //boolean status;

        String result(String e, int m){
            ex = e;
            mark = m;
            String str;
            if (m < 3)
                str = e + " did not pass";
            else
                str = e + " passed";

            return str;
        }
    }
}
