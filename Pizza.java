/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Jake
 */
public class Pizza {
    
    public int percPizzaRemaining= 100;
    public String name;
    public boolean vegetarian;
    
    public void eatPizza(int percEaten){
        percPizzaRemaining = percPizzaRemaining - percEaten;
    }
    
    public int getPercPizzaRemaining(){
        return percPizzaRemaining;
    }
    public void containsMeat(){
        if (vegetarian){
            vegetarian = true;
        } else{
            vegetarian = false;
        }
    }
}
