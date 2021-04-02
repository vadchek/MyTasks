package org.vadim.task42;

import java.util.*;

public class MethodsForStudentList {

    public static ArrayList<Student> sortByCourseThenBySurname(ArrayList<Student> studList){
        ArrayList<Student> sortList = new ArrayList<>(studList);
        CompCourse compByCourse = new CompCourse();
        sortList.sort(compByCourse.thenComparing(new CompSurname()));
        return sortList;
    }

    public static void printStudentList(ArrayList<Student> sortList){
        int courseCount = 0;
        for(int num = 0; num < sortList.size(); num++){
            if(courseCount != sortList.get(num).getCourse()){
                System.out.println("   " + sortList.get(num).getCourse() + " course:");
                courseCount = sortList.get(num).getCourse();
            }
            System.out.println((num + 1) + ". " + sortList.get(num) + " (" + sortList.get(num).getGroup() + ")");
        }
    }

    private static ArrayList<Student> sortByGroup(ArrayList<Student> studList) {
        //Comparator<Student> compByGroup = Comparator.comparing(Student::getGroup);
        Comparator<Student> compByGroup = (student1, student2) -> student1.getGroup().compareTo(student2.getGroup());
        ArrayList<Student> sortByGroupList = new ArrayList<>(studList);
        sortByGroupList.sort(compByGroup);
        return sortByGroupList;
    }

    public static void groupAverageGrade(ArrayList<Student> studList){
        ArrayList<Student> sortByGroupList = new ArrayList<>();
        sortByGroupList = sortByGroup(studList);

        while(!sortByGroupList.isEmpty()) {
            int numberOfStudents = 0;
            double gradeMathematics = 0;
            double gradePhysics = 0;
            double gradeEconomics = 0;
            double gradeEnglish = 0;
            double gradePhilosophy = 0;
            String group = sortByGroupList.get(0).getGroup();

            while (!sortByGroupList.isEmpty() && group.equals(sortByGroupList.get(0).getGroup())){
                numberOfStudents++;
                gradeMathematics += sortByGroupList.get(0).getGrades().get(Subject.MATHEMATICS).getGrade();
                gradePhysics += sortByGroupList.get(0).getGrades().get(Subject.PHYSICS).getGrade();
                gradeEconomics += sortByGroupList.get(0).getGrades().get(Subject.ECONOMICS).getGrade();
                gradeEnglish += sortByGroupList.get(0).getGrades().get(Subject.ENGLISH).getGrade();
                gradePhilosophy += sortByGroupList.get(0).getGrades().get(Subject.PHILOSOPHY).getGrade();
                sortByGroupList.remove(0);
            }
            System.out.println("Average grades of group " + group + ":\n"
                    + Subject.MATHEMATICS + " " + gradeMathematics / numberOfStudents + "\n"
                    + Subject.PHYSICS + " " + gradePhysics / numberOfStudents + "\n"
                    + Subject.ECONOMICS + " " + gradeEconomics / numberOfStudents + "\n"
                    + Subject.ENGLISH + " " + gradeEnglish / numberOfStudents + "\n"
                    + Subject.PHILOSOPHY + " " + gradePhilosophy / numberOfStudents + "\n");
        }
    }

    public static void findBestStudentsInGroups(ArrayList<Student> studList){
        ArrayList<Student> sortByGroupList = new ArrayList<>();
        sortByGroupList = sortByGroup(studList);
        while(!sortByGroupList.isEmpty()) {
            Student student = sortByGroupList.get(0);
            String group = sortByGroupList.get(0).getGroup();
            double studAverage = 0;
            while (!sortByGroupList.isEmpty() && group.equals(sortByGroupList.get(0).getGroup())) {
                if (studAverage < sortByGroupList.get(0).average()) {
                    student = sortByGroupList.get(0);
                    studAverage = sortByGroupList.get(0).average();
                }
                sortByGroupList.remove(0);
            }
            System.out.println("In group " + group + " best student is " + student + " with average " + studAverage);
        }
    }

    public static void findOldestAndYoungestStudents(ArrayList<Student> studList){
        Student old = studList.get(0);
        Student young = studList.get(0);
        for(Student student : studList){
            if(old.getYearOfBirth() > student.getYearOfBirth())
                old = student;
            if(young.getYearOfBirth() < student.getYearOfBirth())
                young = student;
        }
        System.out.println("Oldest student is " + old);
        System.out.println("Youngest student is " + young);
    }
}
