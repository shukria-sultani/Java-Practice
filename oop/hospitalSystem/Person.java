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
public class Person {

    String name;
    int age;
    String phone_number;
    String ID;

    public Person(String name, int age, String phone_number, String ID) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.ID = ID;
    }

    public HashMap<String, Object> showDetails() {
      HashMap <String, Object> details = new HashMap<>();
      details.put("Name", name);
      details.put("Age", age);
      details.put("Phone", phone_number);
      details.put("ID", ID);
      return details;
    }

    public void logger() {
        System.out.println(name + "  logged into the system.");
    }
    public void actionDoingLogger(String firstAction, String secondAction){
        System.out.println(firstAction);
        System.out.println(secondAction);

    }

}
