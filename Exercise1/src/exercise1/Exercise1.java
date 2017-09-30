/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author RyanMunguia
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        /* "System" represents the a package
         * to use. The "." means to drill into
         * the System package and in this case,
         * look for the "out" class. The out class
         * contains functions that deal with
         * system output. The next "." means
         * to drill down into the out class and
         * use the "println" function
         *
         * The "(" indicates data required from
         * you to provide to the println function
         * to work. In this case, println needs
         * a String of information to display
         * on the screen. The String is a literal
         * bit of text that is enclosed within "
        */
        
        /* println's job is to print the literal
         * String of text on the screen and end it
         * with a "new line"
        */
        
        System.out.print("Hello");
        System.out.println(" again");
        /* print will display the literal sequence
         * of characters on the screen but not put
         * a new line after it like println does
        */
        
        System.out.println("Hello\none\tmore time");
        /* "\n" is known as an escape sequence.
         * An escape sequence begins with a "\" within
         * the context of a String (i.e. inside the
         * quotation marks). The very next character
         * after the "\" is the action code for Java
         * to interpret. "\n" means to perform a new
         * line. "\t" means to place a tab in that spot
        */
        
        /* Sometimes you will want to display
         * information pulled in from other
         * sets of data:
        */
        
        System.out.printf("Hello %s\n", "Ryan");
        /* printf means to print "formatted"
         * It follows the rules of a print statement
         * (not a println) and has special characters
         * used to indicate placeholders for additional
         * information
         *
         * The "%s" is a "format specifier" indicating
         * that this is a spot to replaced by other
         * information provided within the printf 
         * function. The "s" means replace the
         * "%s" with a String of information
        
        
         Exercise 1: (Exercise 2.18 in the book)
        
        Write a program that displays exactly the
        picture below
         */ 
        
        System.out.println("*******   ***\t  *\t   *");
        System.out.print("*     *  *   *   ***      * *\n");
        System.out.print("*     * *     * *****    *   *\n");
        System.out.printf("%s     %s %s     %s   %s     %s     %s\n", "*","*","*","*","*","*","*");
        System.out.println("*     * *     *   *      *   *");
        System.out.println("*     *  *   *\t  *       * *");
        System.out.println("*******   ***     *\t   *");
        
    }
    
}
