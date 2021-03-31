package org.vadim.azaza;

import java.util.*;

public class Student {
    private String surname;
    private String name;
    private String patronymic;
    private int yearOfBirth;
    private int course;
    private String group;
    private HashMap<Subject, Grade> grades;

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
        for(int i = 0; i < gradesList.size(); i++){
            sumOfGrades += gradesList.get(i).getGrade();
        }
        return sumOfGrades/gradesList.size();
    }
}
