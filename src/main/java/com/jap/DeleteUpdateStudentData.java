package com.jap;

import com.jap.repository.StudentDetails;
import com.jap.service.StudentService;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class DeleteUpdateStudentData {
    public static void main(String[] args) {
        try {
            StudentService service = new StudentService();
            service.connect();
            service.printConnectionStatus();
            StudentDetails studentDetails = new StudentDetails();
            Connection connection = service.getConnection();
            System.out.println("----------------------------------------------");
            System.out.println(" Student database : ");
            studentDetails.getAllStudentDetails(connection);
            System.out.println("-----------------------------------------------");
            studentDetails.deleteStudentData(connection, 627);
            System.out.println("Student data deleted (roll_number)");
            System.out.println("------------------------------------------------");
            System.out.println("Student data update :");
            studentDetails.updateStudentData(connection, "suriya", 'a', 500, 625);
            System.out.println("-------------------------------------------------");
            System.out.println(" Student database :");
            studentDetails.getAllStudentDetails(connection);
        } catch (SQLException exception) {
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        }

    }
}
