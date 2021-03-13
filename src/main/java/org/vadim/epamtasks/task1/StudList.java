package org.vadim.epamtasks.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class StudList {
    private Student[] array;

    public StudList(Student... obj) {
        array = new Student[obj.length];
        int i = 0;
        for (Student x : obj) {
            array[i] = x;
            i++;
        }
    }

    public void addToList(Student... obj) {
        Student[] add = new Student[obj.length];
        int i = 0;
        for (Student x : obj) {
            add[i] = x;
            i++;
        }
        Student[] buffer = new Student[array.length];
        System.arraycopy(array, 0, buffer, 0, array.length);

        array = new Student[buffer.length + obj.length];
        System.arraycopy(buffer, 0, array, 0, buffer.length);
        if (array.length - buffer.length >= 0)
            System.arraycopy(add, 0, array, buffer.length, array.length - buffer.length);
    }

    public void printList() {
        System.out.println("Students List: ");
        for (Student x : array) {
            System.out.println(x.getId() + ". " + x.getSurname() + " " + x.getName()
                    + " (" + x.getFaculty() + ", " + x.getGroup() + ").");
        }
    }

    public void printFaculty(Faculty faculty) {
        System.out.println("Faculty " + faculty + " List: ");
        for (Student x : array) {
            if (faculty == x.getFaculty())
                System.out.println(x.getId() + ". " + x.getSurname() + " " + x.getName()
                        + " (" + x.getGroup() + ").");
        }
    }

    public void printGroup(String group) {
        System.out.println("Group " + group + " List: ");
        for (Student x : array) {
            if (group == x.getGroup())
                System.out.println(x.getId() + ". " + x.getSurname() + " " + x.getName());
        }
    }

    public void youngsterList(int year) {
        System.out.println("Was born after " + year + " :");
        int currentYear = 9000;
        for (Student x : array) {
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            Calendar date = new GregorianCalendar();
            try {
                date.setTime(format.parse(x.getDateOfBirth()));
                currentYear = date.get(Calendar.YEAR);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (year < currentYear)
                System.out.println(x.getId() + ". " + x.getSurname() + " " + x.getName()
                        + " (" + x.getFaculty() + ", " + x.getGroup() + ").");
        }
    }

}
