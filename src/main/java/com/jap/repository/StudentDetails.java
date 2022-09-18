/*
 * Author Name: M Jaya Suriya
 * Date: 9/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.repository;

import com.jap.model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDetails {
    public void getAllStudentDetails(Connection connection) throws SQLException {
        String readQuery = "SELECT * FROM `school`.`student`;";
        List<Student> studentList = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(readQuery);
            while (resultSet.next()) {
                Student student = new Student();
                student.setRoll_number(resultSet.getInt("roll_number"));
                student.setName(resultSet.getString("name"));
                student.setGrade(resultSet.getString("grade").charAt(0));
                student.setTotal_marks(resultSet.getInt("total_marks"));
                studentList.add(student);
            }
            studentList.forEach(System.out::println);
        }
    }
    public void deleteStudentData(){}

}
