/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice.oop.hospitalSystem;
import java.util.HashMap;

/**
 *
 * @author Shukria Sultani
 * 
 */
public class Employee extends Person {

    String position;
    String department;
    double salary;
    int experience;
    String title;
    public Employee(String name, int age, String phone_number, String ID, String position,
    String department, double salary, int experience, String title) {
        super(name, age, phone_number, ID);
        this.position = position;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
        this.title = title;
    }
     @Override
      public HashMap<String, Object> showDetails() {
      HashMap <String, Object> details = super.showDetails();
      details.put("Position", position);
      details.put("Department", department);
      details.put("Salary", salary);
      details.put("Experience", experience);
      details.put("Title", title);
      return details;
    }
    
}
