package org.vadim.task42;

import java.util.*;

public class Student {
    private final String surname;
    private final String name;
    private final String patronymic;
    private final int yearOfBirth;
    private final int course;
    private final String group;
    private final HashMap<Subject, Grade> grades;

    public Student(String surname, String name, String patronymic, int yearOfBirth, int course, String group, HashMap<Subject, Grade> grades) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.course = course;
        this.group = group;
        this.grades = grades;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public HashMap<Subject, Grade> getGrades() {
        return grades;
    }

    public double average(){
        double sumOfGrades = 0;
        ArrayList<Grade> gradesList = new ArrayList<>(grades.values());
        if(gradesList.size() == 0){
            return 0;
        }
        for (Grade grade : gradesList) {
            sumOfGrades += grade.getGrade();
        }
        return sumOfGrades/gradesList.size();
    }

    public String toString(){
        return surname + " " + name ;
    }
}
