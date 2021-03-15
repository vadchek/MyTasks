package org.vadim.epamtasks.task1;

import java.util.UUID;

public class EpamTask1 {
    public static void main(String[] args){
        Student student1 = new Student(UUID.randomUUID(),2,"Potter","Garry",
                "Ivanovich", "11.03.2021","trololo street, 55.",
                "8-800-555-35-35",Faculty.GRYFFINDOR,"lol!");
        Student student2 = new Student(UUID.randomUUID(),4,"Murphy","Rex",
                "Ivanovich", "11.03.1999","trololo street, 55.",
                "8-800-555-35-35",Faculty.SLYTHERIN,"trol!");
        Student student3 = new Student(UUID.randomUUID(),1,"Travolta","John",
                "Ivanovich", "11.03.2021","trololo street, 55.",
                "8-800-555-35-35",Faculty.HUFFLEPUFF,"ololo");
        Student student4 = new Student(UUID.randomUUID(),1,"Travolta","John",
                "Ivanovich", "11.03.1960","trololo street, 55.",
                "8-800-555-35-35",Faculty.RAVENCLAW,"ololo");
        System.out.println(student1);

        StudList list = new StudList(student1, student2);
        list.printList();
        list.addToList(student3, student4);
        list.printList();
        list.youngsterList(2000);
    }
}
