/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author Shukria Sultani
 */
public class Calculator {

    public static void main(String[] args) {
        int addition = calculate(110, 10, "addition");
        int subtraction = calculate(110, 10, "subtraction");
        int division = calculate(110, 10, "division");
        int multiplication = calculate(110, 10, "multiplication");
        System.out.println("Additon Result: " + addition);
        System.out.println("Additon Result: " + subtraction);
        System.out.println("Additon Result: " + division);
        System.out.println("Additon Result: " + multiplication);

    }

    private static int calculate(int num1, int num2, String operationType) {
        if (operationType.equals("addition")) {
            return num1 + num2;
        } else if (operationType.equals("subtraction")) {
            return num1 - num2;
        } else if (operationType.equals("multiplication")) {
            return num1 * num2;
        } else if (operationType.equals("division")) {
            return num1 / num2;
        } else {
            System.out.println("enter a correct operation type");
            return 0;
        }

    }
}

