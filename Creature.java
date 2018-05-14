/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2_creatures;

/**
 *
 * @author Jake
 */
public class Creature {
    //member variables
    public String name;
    public String species;
    
    // private member variable
    public int biteSizeInPercent;
    public int donutSize;
    
    // method simulating donut being eaten
    public void eatDonut(SizedDonut donutForZebra, SizedDonut donutHenry) {
        if(donutForZebra.sizeInmm > donutSize) {
            System.out.println("Creature.eatDonut | Eating " + biteSizeInPercent + " % of " + donutForZebra.name);
        } else {
            System.out.println("Creature.eatDonut | Henry is too tiny");
        }// close if/else statement
        if(donutHenry.sizeInmm > donutSize) {
            System.out.println("Creature.eatDonut | Eating" + biteSizeInPercent + "% of " + donutHenry.name);
    } else {
            System.out.println("Creature.eatDonut | Megan is a bit too tiny");
            }// close if/else statement
        
    }
    public int getBiteSizeInPercent() {
        return biteSizeInPercent;
    }
    public void setBiteSizeInPercent(int sizeToSet) {
        if(sizeToSet > 0){
            this.biteSizeInPercent = sizeToSet;
            System.out.println("Thats Perfect Size");
        } else {
                    System.out.println("This donut is a tad too small");
                    }// clsoe if/else statement
        }
    // getter method displayed
    public void setMinDonutSizeInmm(int donutSizeToSet){
        if(donutSizeToSet > 15){
            this.donutSize = donutSizeToSet;
            System.out.println("That;s the perfect size");
        } else {
            System.out.println("This donut is way too tiny");
        }// clsoe if/else statement
    }
    // setter method displayed 
    public void getMinDonutSizeInmm(){
    
        System.out.println("The food must be at least " + donutSize + "mm big");
                
    }// method closed
  }// class closed
   

