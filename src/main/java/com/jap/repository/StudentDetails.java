/*
 * Author Name: M Jaya Suriya
 * Date: 9/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.repository;

import com.jap.model.Student;

import java.sql.*;
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

    public void deleteStudentData(Connection connection, int roll_number) throws SQLException {
        String deleteQuery = "DELETE FROM `school`.`student` WHERE (`roll_number` = ?);";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, roll_number);
            preparedStatement.executeUpdate();
        }
    }

    public void updateStudentData(Connection connection, String name, char grade, int total_marks, int roll_number) throws SQLException {
        String updateQuery = "UPDATE `school`.`student` SET `name` = ?,`grade`= ?,`total_marks`= ? WHERE (`roll_number` = ? );";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setInt(1, roll_number);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, String.valueOf(grade));
            preparedStatement.setInt(4, total_marks);
            preparedStatement.executeUpdate();
        }
    }

}
