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
}