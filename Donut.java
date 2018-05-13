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
public class Donut {
    
    private int percRemaining = 100;
    public String name;
    
    public void simulateEating(int percentEaten){
        percRemaining = percRemaining - percentEaten;
    }
    public int getPercRemaining(){
        return percRemaining;
    }
}
