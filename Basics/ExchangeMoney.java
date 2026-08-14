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
public class ExchangeMoney {
       static float dollor = 65.95f;
       static float euro = 75f;
       static float riyal = 0.00035f;
       static float pkRupee = 0.22f;
       static float pound = 12.4f;
       static double result = 0;
    
    public static void main(String[] args){
        System.out.println("Welcome to our exhcange system, choose one operation.");
        Scanner getInput = new Scanner(System.in);
        String option = "";

        while(!option.equalsIgnoreCase("exit")){
        System.out.println("Choose 1 (type the number of the option): ");
        System.out.println("1. Exchange other currencies to Afghani");
        System.out.println("2. Exchange Afghani other currencies");
        System.out.println("Type exit to quit");
        option = getInput.next();
        if(option.equals("1")){
            System.out.println("Enter the currency, Choose one: \n dollor\n euro\n pound\n toman\n pakistani rupee\n");
            String currency = getInput.next();
            System.out.print("Enter the amount: ");
            int amount = getInput.nextInt();
            double exchange = exchangeToAfghani(amount, currency);
            System.out.print(amount +" "+ currency + " is " + exchange + " Afghani");
        } else if(option.equals("2")){
            System.out.println("Enter the currency, Choose one: \ndollor\n euro\n pound\n toman\n pakistani rupee\n");
            String currency = getInput.next();
            System.out.print("Enter the amount: ");
            int amount = getInput.nextInt();
            double exchange = exchangeToOtherCurrencies(amount, currency);
            System.out.print(amount + " Afghani is" + exchange + currency);
        } else if(option.equalsIgnoreCase("exit")){
            System.out.print("Goode bye!");
            break;
        } else{
            System.out.print("Enter a valid option");
        }
        
        }
    }
    // change great to small like dollor to afs
    private static double exchangeToAfghani(int amount, String exchangeCurrency){       
       if(exchangeCurrency.equalsIgnoreCase("dollor")){
           result = dollor * amount;
       } else if(exchangeCurrency.equalsIgnoreCase("euro")){
           result = euro * amount;
       } else if(exchangeCurrency.equalsIgnoreCase("riyal")){
           result = riyal * amount;
       } else if (exchangeCurrency.equalsIgnoreCase("pkRupee")){
           result = pkRupee * amount;
       } else if(exchangeCurrency.equalsIgnoreCase("pound")){
           result = pound * amount;
       } else{
           System.out.print("Please enter a valid currency type");
       }
       return result;
    }
    
    private static double exchangeToOtherCurrencies(int amount, String exchangeCurrency){       
       if(exchangeCurrency.equalsIgnoreCase("dollor")){
           result = amount / dollor;
       } else if(exchangeCurrency.equalsIgnoreCase("euro")){
           result = amount / euro ;
       } else if(exchangeCurrency.equalsIgnoreCase("riyal")){
           result = amount / riyal ;
       } else if (exchangeCurrency.equalsIgnoreCase("pkRupee")){
           result = amount / pkRupee;
       } else if(exchangeCurrency.equalsIgnoreCase("pound")){
           result = amount / pound;
       } else{
           System.out.print("Please enter a valid currency type");
       }
       return result;
    }
}
