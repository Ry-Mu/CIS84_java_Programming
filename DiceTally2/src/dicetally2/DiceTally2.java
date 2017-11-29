/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicetally2;

import java.util.Random;
/**
 *
 * @author RyanMunguia
 */
public class DiceTally2 
{

    public static int roll(int lowerBound, int upperBound)
    {
        int result;
        int result2;
        Random generator = new Random();

        result = generator.nextInt(upperBound) + lowerBound;
        result2 = generator.nextInt(upperBound) + lowerBound;
        
        int sum = result + result2;
        return sum;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result;
        int[] tallies = new int[50];
        
        //Roll die 600,000 times
        for (int c = 0; c < 600000; c++)
        {
            result = roll(1,6);
  
            tallies[result - 1]++;
        }
        
        for (int c = 0; c < 12; c++)
            System.out.printf("%d: %d\n", c+1, tallies[c]);
    }
    
}
