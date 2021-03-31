package org.vadim.azaza;

public enum Grade {
    TWO(2), THREE(3), FOUR(4), FIVE(5);

    private int grade;
    Grade(int grade){
        this.grade = grade;
    }

    public int getGrade(){
        return grade;
    }
}
