/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice.oop.hospitalSystem;

/**
 *
 * @author Shukria Sultani
 */
import java.util.HashMap;
public class DetailsLogger {
    public void logDetails(HashMap<String, Object>details){
      for(HashMap.Entry<String, Object> entry: details.entrySet() ){
          System.out.println(entry.getKey() + " : " + entry.getValue());
      }
    }
    
}
