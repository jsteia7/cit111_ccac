/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weeek7;

import java.util.Random;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Jake
 */
public class MysteryDoors {
    
    public static void main(String[] args){
        //create a scanner object for user
        Scanner keyboardScanner = new Scanner(System.in);
        
        int userChoice;
        
        //Print out options user has to choose from
        System.out.println("WELCOME TO THE MYSTERY BUTTONS");
        System.out.println("______    _____   _____");
        System.out.println("|__1__|  |__2__| |__3__|");
        System.out.println("IF YOU CANT RESIST PUSHING A BUTTON CHOOSE ONE FOR SOME TOP SECRET INFORMATION!");
        
       // 
        
       userChoice = keyboardScanner.nextInt();
       
       //create output for each selection
       switch(userChoice){
           case 1:
               printStatement();//generates an answer to button 1
               break;
           case 2:
               generateLotto();//generates an answer to button 2 and generates a number
               break;
           case 3:
               ifElse();//an if/else statement
               break;
       }
    }
        //generates a statement in responce to users choice
        public static void printStatement(){
            
            System.out.println("");
            System.out.println("***ERROR ERROR ERROR SYSTEM SHUTDOWN INITIATED*** ");
            
        
            
       }
       //generates a random number 
       public static void generateLotto(){
            System.out.println("THIS WEEKS POWERBALL NUMBER IS:");
            Random r= new Random();
            BigInteger bigInt = new BigInteger(4, r);
            System.out.println(bigInt);
            System.out.println("HURRY UP AND GET TO THE NEARST LOTTO CENTER!");
            
       }
       //generates an if else statement 
       public static void ifElse(){
            Scanner input = new Scanner(System.in);
            System.out.println("BLUE PILL FOR YES OR RED PILL FOR NO");
            String a = input.next();
            if(a.equals("no")){
                System.out.println("*****YOU ARE A PAWN IN TODAYS SOCIETY WAIT 10 SECONDS*****");
                int count = 1;
                do {
                    System.out.println("Count is:" + count);
                    count++;
                }while (count<11);
                System.out.println("THOSE ARE 10 SECONDS YOU WILL NEVER GET BACK MWUAHAHAHA");
        //generates a counter that stops at 10
                
            }else{
                System.out.println("CONGRATS YOU ARE WOKE!!! WELCOME TO THE MATRIX");
                
                }//close statements
                
                
            
            
            
            
       }
}
