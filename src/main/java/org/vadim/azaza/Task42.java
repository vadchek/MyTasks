package org.vadim.azaza;

import java.util.*;

public class Task42 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivanov", "Ivan", "Ivanovich", 1999,
                5, "ololo", new HashMap<Subject, Grade>(Map.of(Subject.MATHEMATICS, Grade.FOUR,
                Subject.ECONOMICS, Grade.FIVE, Subject.ENGLISH, Grade.THREE, Subject.PHYSICS, Grade.FIVE,
                Subject.PHYLOSOPHY, Grade.FOUR)));

        System.out.println(student1.average());

    }
}
