/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainfinal;


 
public class Train {
    
    //variables
    public String root;
    public String destination;
    public String trainName;
    public int riders;
    public int rate;
    public double fuelCapacity;
    public double fuelBurnAmount;
    public double distanceToitsDestination;
    
    public int totalMilesRode =0;
    
    public void rideTrain(int totalMiles) {
        totalMilesRode = totalMiles + totalMilesRode;
    }// close
}//clsoe
