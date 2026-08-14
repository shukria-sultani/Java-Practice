/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice.oop.hospitalSystem;
import java.util.HashMap;

/**
 *
 * @author Shukria Sultani
 */
public class Doctor extends Employee{
    String specialization;
     public Doctor(String name, int age, String phone_number, String ID, String position,
    String department, double salary, int experience, String title, String specialization){
      super(name, age, phone_number, ID, position, department, salary, experience, title);
      this.specialization = specialization; 
    }
      @Override
      public HashMap<String, Object> showDetails() {
      HashMap <String, Object> details = super.showDetails();
      details.put("Specialization", specialization);
      return details;
    }
    
}
