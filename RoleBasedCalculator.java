package javapractice;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class RoleBasedCalculator {

    static Scanner getInput = new Scanner(System.in);
    static String username, password;
    static int role;
    static int limit = 0;

    public static void main(String[] args) {
        while (true) {
            boolean isUser = loginUser();
            
            if (isUser) {
                boolean shouldRelogin = doCalculation();
                
                if (!shouldRelogin) {
                    break; 
                }
            } else {
                System.out.println("Try to login again, or type exit to quit:");
                String choice = getInput.next();
                if (choice.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        }
        System.out.println("Exiting calculator. Goodbye!");
    }

    private static boolean loginUser() {
        System.out.println("\n--- Login ---");
        System.out.println("Enter your username: ");
        username = getInput.next();
        System.out.println("Enter your password: ");
        password = getInput.next();
        String message;

        if (username.equals("Shukria") && password.equals("shukria@12")) {
            role = 1;
            limit = 6;
            message = "Welcome " + username + ", you can do all the operations.";
            System.out.println(message);
            return true;
        } else if (username.equals("Zahra") && password.equals("zahra@12")) {
            role = 2;
            limit = 5; 
            message = "Welcome " + username + ", you can do 3 operations.";
            System.out.println(message);
            return true;
        } else {
            role = 0;
            limit = 0;
            message = "Incorrect username or password.";
            System.out.println(message);
            return false;
        }
    }

    private static boolean doCalculation() {
        Map<Integer, String> operations = new HashMap<>();
        operations.put(0, "Exit");
        operations.put(1, "Logout");
        operations.put(2, "+");
        operations.put(3, "-");
        operations.put(4, "*");
        operations.put(5, "/");
        
        String option = "";

        while (true) {
            System.out.println("\nChoose one operation or type 'exit' to quit: ");
            int count = 0;
            for (Map.Entry<Integer, String> entry : operations.entrySet()) {
                if (count >= limit) {
                    break;
                }
                System.out.println(entry.getKey() + " : " + entry.getValue());
                count++;
            }
            
            option = getInput.next();
   
            if (option.equalsIgnoreCase("exit") || option.equals("0")) {
                return false; 
            } 

            if (option.equalsIgnoreCase("logout") || option.equals("1")) {
                return true; 
            } 
            boolean isValid = false;
            if ((option.equals("+") || option.equals("2")) && limit >= 3) isValid = true;
            else if ((option.equals("-") || option.equals("3")) && limit >= 4) isValid = true;
            else if ((option.equals("*") || option.equals("4")) && limit >= 5) isValid = true;
            else if ((option.equals("/") || option.equals("5")) && limit >= 6) isValid = true;

            if (!isValid) {
                System.out.println("Invalid operation or permission denied.");
                continue; 
            }

            System.out.println("Enter the first number:");
            int firstNumber = getInput.nextInt();
            System.out.println("Enter the second number:");
            int secondNumber = getInput.nextInt();

            if (option.equals("+") || option.equals("2")) {
                System.out.println("Result: " + (firstNumber + secondNumber));
            } else if (option.equals("-") || option.equals("3")) {
                System.out.println("Result: " + (firstNumber - secondNumber));
            } else if (option.equals("*") || option.equals("4")) {
                System.out.println("Result: " + (firstNumber * secondNumber));
            } else if (option.equals("/") || option.equals("5")) {
                if (secondNumber == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                }
            }
        }
    }
}