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
public class Patient extends Person {

    String disease;
    String blood_group;
    boolean isPaid;
    

    public Patient(String name, int age, String phone_number, String ID, String disease, String blood_group, boolean isPaid) {
        super(name, age, phone_number, ID);
        this.disease = disease;
        this.blood_group = blood_group;
        this.isPaid = isPaid;
    }
    @Override
      public HashMap<String, Object> showDetails() {
      HashMap <String, Object> details = super.showDetails();
      details.put("Disease", disease);
      details.put("Blood Group", blood_group);
      details.put("Paid Bill", isPaid);
      return details;
    }
    public void patientStatus() {
        System.out.print(name + " is taking medicine");
        if (isPaid) {
            System.out.print(name + " has paid the bill");
        } else {
            System.out.print(name + " has not paid the bill");
        }
    }

    public void patientDetailsLogger(){
    }
}
