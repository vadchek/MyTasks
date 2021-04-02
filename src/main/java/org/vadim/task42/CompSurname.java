package org.vadim.task42;

import java.util.*;

public class CompSurname implements Comparator<Student>{
    public int compare(Student student1, Student student2){
        String studname1 = student1.getSurname() + " " + student1.getName() + " " + student1.getPatronymic();
        String studname2 = student2.getSurname() + " " + student2.getName() + " " + student2.getPatronymic();
        return studname1.compareTo(studname2);
    }
}
