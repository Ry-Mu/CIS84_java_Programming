/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import java.util.Random;
/**
 *
 * @author RyanMunguia
 */
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int number6;
        // When we see variables that share
        // a common intent and name as well as
        // have the same data type, we can use
        // an array
        
        int[] numbers;
        // This declares "numbers" as an array
        // of integers. At this point, the size
        // of the array is not known.
        
        numbers = new int[10];
        // This "allocates" 10 integer spots
        // in memory, all next to each other
        // with all spaces reserved for the
        // numbers array
        
        // At this point, we can assign values
        // to any element of the numbers array
        numbers[3] = 25;
        numbers[7] = 17;
        System.out.println(numbers[3]);
        numbers[0] = 100;
        // It is important to know that the first
        // element in the array starts at index
        // location 0
        
        // How would we set all the numbers in the
        // array with each element a random number?
        // Because the action here is repeated
        // and we know how many times we will do
        // so, we (as often seen with arrays)
        // will use a for loop
        Random generator = new Random();
        for (int index = 0; index < 10; index++)
            numbers[index] = generator.nextInt(100);
        
        // How would we print all elements in 
        // the array?
        for (int index = 0; index < 10; index++)
            System.out.println(numbers[index]);
        
        // Sometimes you will want to initialize
        // all the values of the elements of the
        // array to specific values
        int[] moreNumbers = { 10, 20, 30, 40 };
        
        // The .length property of any array
        // can be used to obtain the size of the
        // array (i.e. how many elements have
        // been allocated)
        for (int index = 0; index < moreNumbers.length; index++)
            System.out.println(moreNumbers[index]);
        System.out.println();
        for (int n : numbers)
            System.out.println(n);
        // Use this notation to go through all
        // elements in the array and temporarily
        // assign each value as you go through
        // the loop to a given variable (in this
        // case, n). Note that you can only use this
        // when reading data from the array and
        // not if you want to change data in the
        // array
        
        // Exercise 6: Modify your solution from
        // exercise 5 to use an array and ask the user
        // how many sides are on each of the 2 dice.
        // The maximum number of sides for the dice is
        // 50.
    }
    
}
