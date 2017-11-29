/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicetally;

import java.util.Random;
/**
 *
 * @author RyanMunguia
 */
public class DiceTally 
{

    public static int roll(int lowerBound, int upperBound)
    {
        int result;
        Random generator = new Random();

        result = generator.nextInt(upperBound) + lowerBound;
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Write a program that simulates rolling
        // a 6-sided die 600,000 times. Each roll
        // result is tallied and then after all
        // the rolls are complete, we report
        // each number's counts
        
        // Variables
        int result;
        int result2;
        int sum;
        int rollTotal;
        int sumTotal;
        int tally1 = 0;
        int tally2 = 0;
        int tally3 = 0;
        int tally4 = 0;
        int tally5 = 0;
        int tally6 = 0;
        
        int tally7 = 0;
        int tally8 = 0;
        int tally9 = 0;
        int tally10 = 0;
        int tally11 = 0;
        int tally12 = 0;
        int tally13 = 0;
        
        // Roll die 600,000 times
        for(int c = 1; c < 60001; c++)
        {
            System.out.println("This is round: " + c);
            result = roll(1, 6);
            System.out.println("The fist roll is: " + result);
            result2 = roll(1, 6);
            System.out.println("The second roll is: " + result2);
            sum = result + result2;
            System.out.println("The sum of these two rolls is: " + sum);
            System.out.println("***************************************************************");
            
            // This line generates a random
            // number from 1 to 6
            
            // Keep track of each result
                // Each time a number appears
                // Add 1 to its counter
            /*
            if (result == 1)
                tally1++;
            else if (result == 2)
                tally2++;
            else if (result == 3)
                tally3++;
            else if (result == 4)
                tally4++;
            else if (result == 5)
                tally5++;
            else
                tally6++;
            */
            
            // Some if statements have a pattern
            // that matches the following conditions:
            //
            // 1) One variable is being tested in all
            //    parts of the if...else chain
            // 2) The variable tested is checking for
            //    specific values and not a range of
            //    values
            // 3) The variables tested is either an
            //    integer or char data type
            //
            // When these conditions are true, the
            // if...else chain can be replaced with
            // a switch statement
            
            switch(result)
            {
                case 1:
                    tally1++;
                    break;
                case 2:
                    tally2++;
                    break;
                case 3:
                    tally3++;
                    break;
                case 4:
                    tally4++;
                    break;
                case 5:
                    tally5++;
                    break;
                
                default:
                    tally6++;
            }
            switch(result2)
            {
                case 1:
                    tally1++;
                    break;
                case 2:
                    tally2++;
                    break;
                case 3:
                    tally3++;
                    break;
                case 4:
                    tally4++;
                    break;
                case 5:
                    tally5++;
                    break;
                
                default:
                    tally6++;
            }
            
            switch(sum)
            {
                case 1:
                    tally8++;
                    break;
                case 2:
                    tally9++;
                    break;
                case 3:
                    tally10++;
                    break;
                case 4:
                    tally11++;
                    break;
                case 5:
                    tally12++;
                    break;
                
                default:
                    tally7++;
            }
        }
        
        // Show the results by print each
        //  tally's count
        System.out.println("Here are the results PER individual dice roll:");
        System.out.println("1: " + tally1);
        System.out.println("2: " + tally2);
        System.out.println("3: " + tally3);
        System.out.println("4: " + tally4);
        System.out.println("5: " + tally5);
        System.out.println("6: " + tally6);
        
        System.out.println("***************************************************************");
        System.out.println("Here are the SUM results:");
        System.out.println("7: " + tally7);
        System.out.println("8: " + tally8);
        System.out.println("9: " + tally9);
        System.out.println("10: " + tally10);
        System.out.println("11: " + tally11);
        System.out.println("12: " + tally12);
        
        
        rollTotal = tally1 + tally2 + tally3 + tally4 + tally5 + tally6;
        
        sumTotal = tally7 + tally8 + tally9 + tally10 + tally11 + tally12;
        
        System.out.println("The total number of rolls is: " + rollTotal + ", " + rollTotal/2 + " for each die");
        
    }
    
    // Exercise 5
    // Update this program to simulate rolling
    // 2 6-sided dice 600,000 times.
    
    // This will require capturing 2 results
    // of generating a random number from 1-6,
    // and then adding the results together...
    
}
