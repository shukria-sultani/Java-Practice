/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Shukria Sultani
 */
public class EmployeesTable {

    static Scanner getInput = new Scanner(System.in);

    public static void main(String[] args) {
        generateTable();
        getInput.close();
    }

    private static void generateTable() {
        System.out.print("Enter the number of Employees: ");
        int numberOfEmployees = getInput.nextInt();
        int col = 4;
        String[][] employees = new String[numberOfEmployees][col];
        for (int row = 0; row < employees.length; row++) {
            System.out.print("Enter the employee id: ");
            String employeeId = getInput.next();
            System.out.print("Enter the employee name: ");
            String employeeName = getInput.next();
            System.out.print("Enter " + employeeName + "'s position: ");
            String position = getInput.next();
            System.out.print("Enter " + employeeName + "'s salary: ");
            String salary = getInput.next();
            employees[row][0] = employeeId;
            employees[row][1] = employeeName;
            employees[row][2] = position;
            employees[row][3] = salary;
        }
        System.out.println("| ID | Name | Position | Salary |");

        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees[i].length; j++) {
                System.out.print(employees[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println("--------------------------------");
        }
    }
}
