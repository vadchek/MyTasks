package org.vadim.epamtasks.task1;

import java.util.UUID;

public class Student {
    final private UUID id;
    private int grade;
    private String surname;
    final private String name;
    final private String patronymic;
    final private String dateOfBirth;
    private String address;
    private String phone;
    private Faculty faculty;
    private String group;

    public Student(UUID id, int grade, String surname, String name, String patronymic, String dateOfBirth, String address, String phone, Faculty faculty, String group){
        this.id = id;
        this.grade = grade;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.group = group;
    }

    private String createGroup(Faculty faculty, int yearOfEntering){
        String group = "";
        switch (faculty){
            case RAVENCLAW:
                group = "R";
            case SLYTHERIN:
                group = "S";
            case GRYFFINDOR:
                group = "G";
            case HUFFLEPUFF:
                group = "H";
        }
        group = group + yearOfEntering;
        return group;
    }

    public UUID getId() {
        return id;
    }

    public int getYear() {
        return grade;
    }

    public void setYear(int year) {
        this.grade = year;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String toString(){
        return ("ID: " + id + "\n"
                + surname + " " + name + " " + patronymic + "\n"
                + "Date of birth: " + dateOfBirth + "\n"
                + "Address: " + address + "\n"
                + "Phone: " + phone + "\n"
                + "Faculty: " + faculty + "\n"
                + "Grade: " + grade + "\n"
                + "Group: " + group + "\n"
        );
    }
}

