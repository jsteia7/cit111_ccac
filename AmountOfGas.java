/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weeek4;

import java.util.Scanner;
/**
 *
 * @author Jake
 */
public class AmountOfGas {
    // this is the entry point to our program
    public static void main(String[]arg) {
        
        System.out.println("********Will I Make It********");
    
  
  double MilesPerGallon;
  double GallonsLeft;
  double MilesLeft;
  
 Scanner userInputScanner = new Scanner(System.in);
 
 // Get the number of miles your vehilcle gets per gallon
 System.out.println("How many miles per gallon does your car get?");
 //What ever user typed on keyboard goes into the variable miles per gallon
 MilesPerGallon = userInputScanner.nextDouble();
 
 // Get how many gallons remain in the tank of the users vehicle
 System.out.println("How many gallons remain in your tank?");
 
 GallonsLeft = userInputScanner.nextDouble();
 
 if(MilesPerGallon<0){
 System.out.println("Start Over");
 }
 
 //Get how many miles to the closest station
 System.out.println("How many miles to the nearest gas station?");
 
 MilesLeft = userInputScanner.nextDouble();
 
 
 if(GallonsLeft * MilesPerGallon >= MilesLeft) {
 System.out.println("Hooray, youll make it to the next station!");
 }
 
 else{
     System.out.println("Bad news, you're in for a walk to the station.");
 }
 
 


 
 
 

 
 
    }
 
    }
