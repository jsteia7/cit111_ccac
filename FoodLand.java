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
public class FoodLand {
    
    final static int smallBite = 10;
    final static int bigBite = 25;
            
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Donut firstDonut;
        firstDonut = new Donut ();
        firstDonut.name = "Glazed";
        printObjectDataDonut(firstDonut);
        System.out.println();
        
        Donut secondDonut;
        secondDonut = new Donut ();
        secondDonut.name = "CreameFilled";
        printObjectDataDonut(secondDonut);
        System.out.println();
        
        System.out.println("Chowing " + firstDonut.name);
        System.out.println("Munch.....");
        firstDonut.simulateEating(bigBite);
        printObjectDataDonut(firstDonut);
        System.out.println();
        
        System.out.println("Chowing" + secondDonut.name);
        System.out.println("Munch Munch...");
        secondDonut.simulateEating(smallBite);
        printObjectDataDonut(secondDonut);
        System.out.println();
        
        System.out.println("Just going to crush this " + firstDonut.name);
        
        Pizza firstPizza;
        firstPizza = new Pizza ();
        firstPizza.name = "PEPPERONI";
        firstPizza.vegetarian = false;
        printObjectDataPizza(firstPizza);
        System.out.println();
        
        Pizza secondPizza;
        secondPizza = new Pizza ();
        secondPizza.name = "MEDITERRANEAN";
        secondPizza.vegetarian= true;
        printObjectDataPizza(secondPizza);
        System.out.println();
        
        
        System.out.println("Chowing " + firstPizza.name);
        System.out.println("NIBBLE");
        firstPizza.eatPizza(smallBite);
        printObjectDataPizza(firstPizza);
        System.out.println();
        
        System.out.println("Chowing " + secondPizza.name);
        System.out.println("CHOMP");
        secondPizza.eatPizza(bigBite);
        printObjectDataPizza(secondPizza);
        System.out.println();
        
        Hoagie firstHoagie = new Hoagie();
        firstHoagie.name = "Italian";
        firstHoagie.vegetarian = false;
        printObjectDataHoagie(firstHoagie);
        System.out.println();
        
        Hoagie secondHoagie = new Hoagie();
        secondHoagie.name = "Cucumber Deluxe";
        secondHoagie.vegetarian = true;
        printObjectDataHoagie(secondHoagie);
        System.out.println();
        
        System.out.println("Chowing " + firstHoagie.name);
        System.out.println("NIBBLE...");
        firstHoagie.eatHoag(smallBite);
        printObjectDataHoagie(firstHoagie);
        System.out.println();
        
        System.out.println("Chowing " + secondHoagie.name);
        System.out.println("SCARF..");
        secondHoagie.eatHoag(bigBite);
        printObjectDataHoagie(secondHoagie);
        System.out.println();
                
        
        
        //method main closed
    }
    
    private static void printObjectDataDonut(Donut inputDonut) {
        System.out.println("|-----DONUT STATISTICS-----|");
        System.out.println(" Name of Donut: " + inputDonut.name);
        System.out.println("Percernt Remaining: " + inputDonut.getPercRemaining());
        System.out.println("|--------------------------|");
    }//object Donut closed
    private static void printObjectDataPizza(Pizza inputPizza){
        System.out.println("|-----PIZZA STATISTICS-----|");
        System.out.println(" Name of Pizza: " + inputPizza.name);
        System.out.println(" Is this pizza vegatarian: " + inputPizza.vegetarian);
        System.out.println("---------------------------|");
    }// object Pizza closed
    private static void printObjectDataHoagie(Hoagie inputHoagie){
        System.out.println("|-----HOAGIE STATISTICS-----|");
        System.out.println(" Name of Hoagie: " + inputHoagie.name);
        System.out.println(" Percent Remaining: " + inputHoagie.getPercHoagRemaining());
        System.out.println(" Is this hoagie vegatarian: " + inputHoagie.vegetarian);
        System.out.println("|---------------------------|");
        
        // object Hoagie closed
    }
}
