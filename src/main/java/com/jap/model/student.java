/*
 * Author Name: M Jaya Suriya
 * Date: 9/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        student student = (student) o;

        if (roll_number != student.roll_number) return false;
        if (grade != student.grade) return false;
        if (total_marks != student.total_marks) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = roll_number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) grade;
        result = 31 * result + total_marks;
        return result;
    }

    @Override
    public String toString() {
        return "student{" +
                "roll_number=" + roll_number +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", total_marks=" + total_marks +
                '}';
    }
}
