/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg4;  
import java.util.Scanner;


/**
 *
 * @author RyanMunguia
 */

    
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
        double test = (4.11 + 4.11);
        System.out.println(test);
        Scanner input = new Scanner(System.in);

        double product1 = 2.98;
        double product2 = 4.5;
        double product3 = 9.98;
        double product4 = 4.49;
        double product5 = 6.87;


        int product1Count = 0;
        int product2Count = 0;
        int product3Count = 0;
        int product4Count = 0;
        int product5Count = 0;

        int productNumber;
        int quantitySold;
    
        do
            {
                System.out.println("This program will calculate your costs. Press -1 to end program.");
                System.out.print("Which product would you like to buy?: ");
                productNumber = input.nextInt();

                System.out.print("And how many of those would you like?: ");
                quantitySold = input.nextInt();

                switch(productNumber)
                {
                    case 1:
                        product1Count += quantitySold;
                        break;
                    case 2:
                        product2Count += quantitySold;
                        break;
                    case 3:
                        product3Count += quantitySold;
                        break;
                    case 4:
                        product4Count += quantitySold;
                        break;
                    case 5:
                        product5Count += quantitySold;
                        break;
                    default:
                        System.out.println("Invalid number. Please enter a 1-5");
                        break;
                }   

            } while (productNumber != -1 || quantitySold != -1);
        
        double prod1Total = (product1 * product1Count);
        double prod2Total = (product2 * product2Count);
        double prod3Total = (product3 * product3Count);
        double prod4Total = (product4 * product4Count);
        double prod5Total = (product5 * product5Count);
        
        double totalPurchase = Math.round(prod1Total + prod2Total + prod3Total + prod4Total + prod5Total);
        
        
        System.out.println("***************************************************************");
        System.out.println("The total amount of product 1's sold is: " + product1Count);
        System.out.println("You purchased: $" + prod1Total + " of product 1");
        System.out.println("***************************************************************");
        
        System.out.println("The total amount of product 2's sold is: " + product2Count);
        System.out.println("You purchased: $" + prod2Total + " of product 2");
        System.out.println("***************************************************************");
        
        System.out.println("The total amount of product 3's sold is: " + product3Count);
        System.out.println("You purchased: $" + prod3Total + " of product 3");
        System.out.println("***************************************************************");
        
        System.out.println("The total amount of product 4's sold is: " + product4Count);
        System.out.println("You purchased: $" + prod4Total + " of product 4");
        System.out.println("***************************************************************");
        
        System.out.println("The total amount of product 5's sold is: " + product5Count);
        System.out.println("You purchased: $" + prod5Total + " of product 5");
        System.out.println("***************************************************************");
        
        System.out.println("The total value of all products sold is: $" + totalPurchase);
   
    }    
 }