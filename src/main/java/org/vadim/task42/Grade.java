package org.vadim.task42;

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
