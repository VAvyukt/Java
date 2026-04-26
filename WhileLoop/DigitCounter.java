/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WhileLoop;

/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class DigitCounter {
  public static void main (String args[]) {
        Scanner DigitCounter = new Scanner(System.in); 
        System.out.println("Enter a Number");
        long userInput = DigitCounter.nextLong();
        long number=userInput;
        long count=0;
        while (number>0)
        {
           count++;
           number=number/10;
        }
      System.out.println("Total number of digits is "+count+ ".");
}  
}
    