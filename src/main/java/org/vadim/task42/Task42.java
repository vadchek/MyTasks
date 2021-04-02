package org.vadim.task42;

import java.util.*;

public class Task42 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivanov", "Ivan", "Ivanovich", 1999,
                3, "azaza", new HashMap<>(Map.of(Subject.MATHEMATICS, Grade.FOUR,
                Subject.ECONOMICS, Grade.FIVE, Subject.ENGLISH, Grade.THREE, Subject.PHYSICS, Grade.FIVE,
                Subject.PHILOSOPHY, Grade.FOUR)));
        Student student2 = new Student("Petrov", "Petr", "Petrovich", 1997,
                5, "ololo", new HashMap<>(Map.of(Subject.MATHEMATICS, Grade.FIVE,
                Subject.ECONOMICS, Grade.FIVE, Subject.ENGLISH, Grade.FIVE, Subject.PHYSICS, Grade.FIVE,
                Subject.PHILOSOPHY, Grade.FOUR)));
        Student student3 = new Student("Smirnov", "Oleg", "Borisovich", 1998,
                5, "ololo", new HashMap<>(Map.of(Subject.MATHEMATICS, Grade.TWO,
                Subject.ECONOMICS, Grade.FOUR, Subject.ENGLISH, Grade.THREE, Subject.PHYSICS, Grade.THREE,
                Subject.PHILOSOPHY, Grade.FIVE)));
        Student student4 = new Student("Pavlov", "Semen", "Glebovich", 2002,
                1, "ololo", new HashMap<>(Map.of(Subject.MATHEMATICS, Grade.THREE,
                Subject.ECONOMICS, Grade.FIVE, Subject.ENGLISH, Grade.THREE, Subject.PHYSICS, Grade.THREE,
                Subject.PHILOSOPHY, Grade.THREE)));
        Student student5 = new Student("Popov", "Viktor", "Mikhailovich", 2000,
                3, "ololo", new HashMap<>(Map.of(Subject.MATHEMATICS, Grade.FOUR,
                Subject.ECONOMICS, Grade.FIVE, Subject.ENGLISH, Grade.FOUR, Subject.PHYSICS, Grade.FOUR,
                Subject.PHILOSOPHY, Grade.FOUR)));
        Student student6 = new Student("Kozlov", "Pavel", "Sergeevich", 1999,
                4, "azaza", new HashMap<>(Map.of(Subject.MATHEMATICS, Grade.FIVE,
                Subject.ECONOMICS, Grade.FIVE, Subject.ENGLISH, Grade.THREE, Subject.PHYSICS, Grade.FIVE,
                Subject.PHILOSOPHY, Grade.TWO)));
        Student student7 = new Student("Gorelov", "Dmitry", "Pavlovich", 1997,
                5, "azaza", new HashMap<>(Map.of(Subject.MATHEMATICS, Grade.FOUR,
                Subject.ECONOMICS, Grade.FOUR, Subject.ENGLISH, Grade.THREE, Subject.PHYSICS, Grade.THREE,
                Subject.PHILOSOPHY, Grade.FIVE)));
        Student student8 = new Student("Nosov", "Anton", "Igorevich", 2001,
                2, "ololo", new HashMap<>(Map.of(Subject.MATHEMATICS, Grade.FOUR,
                Subject.ECONOMICS, Grade.FIVE, Subject.ENGLISH, Grade.FIVE, Subject.PHYSICS, Grade.FOUR,
                Subject.PHILOSOPHY, Grade.THREE)));
        Student student9 = new Student("Durov", "Vladimir", "Ivanovich", 1998,
                4, "azaza", new HashMap<>(Map.of(Subject.MATHEMATICS, Grade.FOUR,
                Subject.ECONOMICS, Grade.FIVE, Subject.ENGLISH, Grade.FOUR, Subject.PHYSICS, Grade.FOUR,
                Subject.PHILOSOPHY, Grade.FIVE)));
        Student student10 = new Student("Belov", "Artem", "Fedorovich", 2001,
                2, "ololo", new HashMap<>(Map.of(Subject.MATHEMATICS, Grade.THREE,
                Subject.ECONOMICS, Grade.FIVE, Subject.ENGLISH, Grade.THREE, Subject.PHYSICS, Grade.FOUR,
                Subject.PHILOSOPHY, Grade.THREE)));

        ArrayList<Student> studList = new ArrayList<>();
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);
        studList.add(student4);
        studList.add(student5);
        studList.add(student6);
        studList.add(student7);
        studList.add(student8);
        studList.add(student9);
        studList.add(student10);

        MethodsForStudentList.printStudentList(MethodsForStudentList.sortByCourseThenBySurname(studList));
        System.out.println("\n");
        MethodsForStudentList.groupAverageGrade(studList);
        System.out.println("\n");
        MethodsForStudentList.findBestStudentsInGroups(studList);
        System.out.println("\n");
        MethodsForStudentList.findOldestAndYoungestStudents(studList);
    }
}
