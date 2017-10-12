/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg3;

import java.util.Scanner;

/**
 *
 * @author RyanMunguia
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 8: ");
        int factorialNumber = input.nextInt();
        int i = factorialNumber - 1;
        
        while (i >= 1)
        {
            factorialNumber *= i;
            System.out.println("Iterating through, factorialNumber is: " + factorialNumber);
            i--;
           
        }
        System.out.println(factorialNumber);
    }
    
}
