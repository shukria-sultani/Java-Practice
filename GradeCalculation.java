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
public class GradeCalculation {
    public static void main(String[] args){
        calcaulateGrade();
    }
    private static void calcaulateGrade(){
      int numSubjects;
      Scanner getInput = new Scanner(System.in);
      System.out.print("Enter the number of subjects: ");
      numSubjects = getInput.nextInt();
      numSubjects += 1;
      String[] subjects = new String[numSubjects];
      int[] scores = new int[numSubjects];
      int[] credits = new int[numSubjects];
      for(int i = 1; i < numSubjects; i++){
          System.out.print("Enter subject " + i + ":");
          subjects[i] = getInput.next();
          System.out.print("Enter mark for subject "+ i + ":" );
          scores[i]= getInput.nextInt();
          System.out.print("Enter the credit for subject "+ i + ":");
          credits[i]= getInput.nextInt();
      }

      int totalByCredit = 0;
      int totalCredits = 0;
      for(int i = 0;i < credits.length; i++){
          totalCredits += credits[i];
      }
      for (int i = 0; i < scores.length; i++){
          for(int j = 0; j < credits.length; j++){
              totalByCredit += scores[i] * credits[j];
          }
      }
     System.out.println("Total Credits: " + totalCredits);
     System.out.println("Total Marks: " + totalByCredit);
     System.out.println("Percentage: " + (totalByCredit /totalCredits));
    }
}
