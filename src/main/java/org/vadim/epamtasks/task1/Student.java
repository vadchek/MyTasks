package org.vadim.epamtasks.task1;

public class Student {
    private int id;
    private int year;
    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;
    private String address;
    private String phone;
    private Faculty faculty;
    private String group;

    public Student(int id, int year, String surname, String name, String patronymic, String dateOfBirth, String address, String phone, Faculty faculty, String group){
        this.id = id;
        this.year = year;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
                + "Year: " + year + "\n"
                + "Group: " + group + "\n"
        );
    }
}

