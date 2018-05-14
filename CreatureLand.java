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
public class CreatureLand {

    /*
     */
    public static void main(String[] args) {
         
            Creature zebra;
            zebra = new Creature();
            zebra.name = " Carl ";
            zebra.species = "Mini Zebra";
            zebra.setBiteSizeInPercent(5);
            zebra.setMinDonutSizeInmm(25);
            zebra.getMinDonutSizeInmm();
            
            displayCreatureStats(zebra);
            
            SizedDonut donutForZebra = new SizedDonut();
            donutForZebra.name = "Megan";
            donutForZebra.sizeInmm = 32;
            
            SizedDonut donutHenry = new SizedDonut();
            donutHenry.name = "Henry";
            donutHenry.sizeInmm = 15;
            
            zebra.eatDonut(donutForZebra, donutHenry);
            
            displaySizedDonutStats(donutForZebra);
            displayDonutHenryStats(donutHenry);
        }
        
        public static void displayCreatureStats(Creature zebra){
            System.out.println("***CREATURE STATISTICS***");
            System.out.println("Name: " + zebra.name);
            System.out.println("Species: " + zebra.species);
            System.out.println("Bite Size: " + zebra.getBiteSizeInPercent()
                    + "% of a donut");
            System.out.println("Min SizedDonut size: " + zebra.donutSize + "mm");
            System.out.println("************************");
        }// method close
        
        public static void displaySizedDonutStats(SizedDonut donutForZebra) {
            System.out.println("---SizedDonut Statistics***");
            System.out.println("Name: " + donutForZebra.name);
            System.err.println("Size: " + donutForZebra.sizeInmm + "mm");
            System.out.println("Percent Remaining: " + donutForZebra.getPercRemaining() + "%");
            System.out.println("*************************");
        }// method close
        public static void displayDonutHenryStats(SizedDonut donutHenry) {
            System.out.println("****SizedDonuts Stats****");
            System.out.print("Name: " + donutHenry.name);
            System.out.println("Size: " + donutHenry.getPercRemaining() + "%");
            System.out.println("**************************");
        }// method close
    }// class close
    

