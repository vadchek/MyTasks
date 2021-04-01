package org.vadim.task42;

import java.util.*;

public class CompCourse implements Comparator<Student>{
    public int compare(Student student1, Student student2){
        if(student1.getCourse() < student2.getCourse())
            return -1;
        if(student1.getCourse() == student2.getCourse())
            return 0;
        else
            return 1;

    }
}
