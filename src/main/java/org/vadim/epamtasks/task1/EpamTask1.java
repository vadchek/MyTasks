package org.vadim.epamtasks.task1;

public class EpamTask1 {
    public static void main(String[] args){
        Student student1 = new Student(123,2,"Potter","Garry",
                "Ivanovich", "11.03.21","trololo street, 55.",
                "8-800-555-35-35",Faculty.GRYFFINDOR,"lol!");
        Student student2 = new Student(228,4,"Murphy","Rex",
                "Ivanovich", "11.03.21","trololo street, 55.",
                "8-800-555-35-35",Faculty.SLYTHERIN,"trol!");
        Student student3 = new Student(555,1,"Travolta","John",
                "Ivanovich", "11.03.21","trololo street, 55.",
                "8-800-555-35-35",Faculty.HUFFLEPUFF,"ololo");
        Student student4 = new Student(555,1,"Travolta","John",
                "Ivanovich", "11.03.21","trololo street, 55.",
                "8-800-555-35-35",Faculty.RAVENCLAW,"ololo");
        System.out.println(student1);

        StudList list = new StudList(student1, student2);
        list.printList();
        list.addToList(student3, student4);
        list.printList();
    }
}
