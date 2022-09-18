/*
 * Author Name: M Jaya Suriya
 * Date: 9/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.repository;

import com.jap.model.Student;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class StudentDetails {
    public void getAllStudentDetails(Connection connection) {
        String readQuery = "SELECT * FROM `school`.`student`;";
        List<Student> studentList = new ArrayList<>();
    }

}
