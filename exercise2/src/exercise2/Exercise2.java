/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 * This is the section where we can write all
 * our import instructions (after the package
 * declaration and before the class declaration)
 */

import java.util.Scanner;
// This line imports the Scanner class for use
// in the program.

/* This covers section 2.5 - in the book*/

/**
 *
 * @author RyanMunguia
 */
public class Exercise2 {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /* Scanner is a collection of functions
         * that provide the capabilities to handle
         * user input. Initially, the Scanner
         * is unrecognized so we must make sure
         * when we do this, we "import" the Scanner
         * module.
        */
        Scanner input = new Scanner(System.in);
        /* This defines the "input" object as
         * the means to handle user input
        */
        
        /* We now need to use places in memory
         * that will store the user input
        */
        int number1;
        int number2;
        int sum;
        
        /* These are variable declarations. The
         * "int" is a data type that is used to
         * state what kind of information will
         * be stored in the "number1" variable.
         * We can have multiple variables of the
         * same type like "number2" and "sum"
        */
        
        /* Now that we have our variables and
         * the use of the Scanner established,
         * we can start with the meat of the
         * program...
        */
        
        /* This code prompts the user to enter a number
         * and then gets the number when the user enters
         * it through input.nextInt().
        */
        System.out.println("Please enter the first number");
        number1 = input.nextInt();
        /* number1 is being "assigned" a value
         * which in this case is the result of
         * the number the user enters through input.
         * The "=" is the code for handling an
         * assignment. The assignment technically takes
         * the value on the right of the "=" and stores
         * it in the variable on the left
        */
        
        System.out.println("Please enter the second number");
        number2 = input.nextInt();
        
        /* Now that we have 2 numbers, we want to
         * add them and store the result in the
         * "sum" variable
        */
        sum = number1 + number2;
        /* The "+" is a math operator that checks
         * the data types of the values on either
         * side of it. If the types match, it will
         * perform the math operation as intended
         * for that data type. The result of the
         * operation is then assigned to sum
        */
        
        /* Now that we have the sum, we'll print
         * it out
        */
        System.out.println("The total is " + sum);
        /* In this case, the "+" operator has a
         * String and an int on either side. These
         * types don't match. When the types don't
         * match, the more complex type (the dominant
         * type) takes precedence forcing the other
         * type to upgrade itself to that matching type.
         * In this case, the sum integer converts
         * automatically to a String and then the
         * two Strings are "concatenated"
        */
        
        /* Another way would be to use the printf
         * function
        */
        System.out.printf("The total is %d\n", sum);
        /* The %d format specifier here is
         * designed to be replaced by an integer
         * value.
        */
        
        /* There are 5 math operators in Java
         * Addition, subtraction, multiplication
         * division and remainder (modulus)
        */
        int difference = number1 - number2;
        int product = number1 * number2;
        int result = number1 / number2;
        /* The division operator is special
         * because if it sees integers on either
         * side, it performs an integer division
         * which means any remainder is chopped
         * off (5 / 3 will result in 1)
        */
        
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.println("The result is: " + result);
        
        /* The fifth operator performs an
         * integer division and returns the
         * remainder
        */
        int remainder = number1 % number2;
        System.out.println("The remainder is: " + remainder);
        
        /* Math operators also follow standard
         * order of operations
        */
        int answer = number2 * (number1 - 5);
        System.out.println(answer);
        
        /* Now that we can perform basic math
         * operations, we can use these functions
         * to write programs that can make decisions
         * based on the results
        */
        
        /* Equality check: let's write a program
         * that prints out whether or not the
         * two given numbers are equal
        */
            
        /* The if statement must be followed by
         * parentheses and within it is an expression
         * that results in a value of true or false.
         * If the result is true, the first body of
         * code is executed. If it is not, the second
         * body of code (after the else) is executed
         * Only one of those bodies of code will
         * execute and when either one is done, control
         * resumes to the point at the end if the if...else
         * statement
         */
        if (number1 == number2)
        {
            System.out.println("The numbers are equal");
        }
        else
        {
            System.out.println("The numbers are not equal");
        }
        System.out.println("Have a nice day");
        
        /* There are 6 relational operators in total:
         * equality: ==
         * less than: <
         * greater than: >
         * less than or equal to: <=
         * greater than or equal to: >=
         * inequality: !=
        */
        
        /* Exercise 2: (2.25 in the book)
         * Write a program that asks the user
         * for a number and then tells the user
         * if that number is odd or even.
         * Write this program in a new and separate
         * project
        */
        System.out.println("**************************");
        System.out.println("******* Exercise 2 *******");
        
        System.out.println("Please enter the first number");
        number1 = input.nextInt();
        
        
        if (number1 % 2 == 0)
        {
            System.out.println("The number that you chose is EVEN!!!");
        }
        else
        {
            System.out.println("The number that you chose is ODD!!!");
        }
        System.out.println("Have a nice day");
        
        
         
         
    }
}
