/*
 * Author Name: M Jaya Suriya
 * Date: 9/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.model;

public class student {
    private int roll_number;
    private String name;
    private char grade;
    private int total_marks;

    public student() {
    }

    public student(int roll_number, String name, char grade, int total_marks) {
        this.roll_number = roll_number;
        this.name = name;
        this.grade = grade;
        this.total_marks = total_marks;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(int total_marks) {
        this.total_marks = total_marks;
    }
}
