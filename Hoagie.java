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
public class Hoagie {
    public int percHoagRemaining = 100;
    public String name;
    public boolean vegetarian;
    
    public void eatHoag(int percEaten){
        percHoagRemaining = percHoagRemaining - percEaten;
    }
    public int getPercHoagRemaining(){
        return percHoagRemaining;
    }
    public void containsMeat(){
        if (vegetarian){
            vegetarian = true;
        }else {
            vegetarian = false;
        }
    }
}
