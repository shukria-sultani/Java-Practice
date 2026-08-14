/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapractice.oop.hospitalSystem;

/**
 *
 * @author Shukria Sultani
 */

/**
 * 
 String name, int age, String phone_number, String ID, String position,
    String department, double salary, int experience, String title, String specialization
 */
public class HospitalSystem {

    public static void main(String[] args) {
       Doctor ali = new Doctor("Ali",23,"0779890123","D1","Doctor","Surgery", 300000, 4,"Surgon", "Heart Surgery");
       DetailsLogger logger = new DetailsLogger();
       logger.logDetails(ali.showDetails());
       ali.logger();
       ali.actionDoingLogger(ali.name+ " is checking the patients", ali.title +" " + ali.name + " has written the prescription");
//       Patient ahmad = new Patient("Ahmad", 23,"0779890123", "P1", "Flue", "A+",false);
//       logger.logDetails(ahmad.showDetails());
    }
    
}
