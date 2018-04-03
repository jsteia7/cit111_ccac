/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author Jake
 */
public class UnitConverter {
    
    public static void main(String[] args){
        
        System.out.println("--------------------------------------------------------------");
        System.out.println ("-----------WELCOME TO A DISTANCE UNIT CONVERTER-------------");
        System.out.println ("--------------------------------------------------------------");
        
        // make a scanner for obtaining user input
        Scanner scan = new Scanner(System.in);
        
        // input number of kilometers to convert to meters
        int m = 1000;
        System.out.println ("Enter the Distance traveled in Kilometers to convert to Meters");
        System.out.println ("--------------------------------------------------------------");
        double km;
        km= scan.nextDouble();
        double kmtometer=km*m;
        //display user results
        System.out.println( km+ "kilometers is "  +kmtometer+  "  meters");
        
        //spacing lines
        System.out.println ("---------------------------------------------------------------");
        
        // next method input number of miles to convert to km
        double miles;
        System.out.println("Enter in the Miles traveled to convert to Kilometers");
        miles = scan.nextInt();
        double kilometers = miles * 1.609344;
        // display the users results
        System.out.println(miles + "miles is equal to " + kilometers + " kilometers ");
        
        // program spacing
        System.out.println ("---------------------------------------------------------------");
        
        // input of the amount of feet to convert to meters
        System.out.println("Enter in the amount of Feet to convert to Meters");
        Scanner input = new Scanner (System.in);
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        // display the users results
        System.out.println (feet + " feet is " + meters + " meters.");
        
        System.out.println ("---------------------------------------------------------------");
        
        //thank user
        System.out.println ("THANKS FOR USING THIS CONVERTER HAVE A GREAT DAY!!");
        
        
        ;
        
        
        
        
        
        
    }// close main method
}
