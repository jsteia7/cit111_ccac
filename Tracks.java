/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainfinal;



/**
 *
 * @author Jake
 */
public class Tracks {

 
  
    public static void main(String[] args) {
      
       Train firstTrain = new Train();
       
       double firstTrainEndurance;
       
       firstTrain.trainName = "JakesSpeedRail";
       firstTrain.root = "New York";
       firstTrain.destination = "Florida";
       firstTrain.riders = 155;
       firstTrain.rate = 225;
       firstTrain.fuelCapacity = 300;
       firstTrain.fuelBurnAmount = 22;
       firstTrain.distanceToitsDestination = 435;
       
       firstTrainEndurance = firstTrain.fuelCapacity / firstTrain.fuelBurnAmount;
       
       System.out.println("Train Company name: " + firstTrain.trainName);
       System.out.println("Root: " + firstTrain.root);
       System.out.println("Destination: " + firstTrain.destination);
       System.out.println("Amount of riders: " + firstTrain.riders);
       System.out.println("Rate of train mp/h: " + firstTrain.rate +"mph" );
       System.out.println("Train fuel capacity: " + firstTrain.fuelCapacity + "liters");
       System.out.println("Fuel's burn amount per gallons: " + firstTrain.fuelBurnAmount + "gallons");
       
       
       firstTrain.rideTrain(1146);
       
       System.out.println("The Total amount of miles rode: " + firstTrain.totalMilesRode);
       
       System.out.println("This train can stay moving for about " + firstTrainEndurance + "hours");
       
       System.out.println("Thanks for riding with JakesSpeedRail Have A Great Day!");
               
               
       
      
    }//close
    
}//close
