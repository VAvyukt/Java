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
public class SumofDigits  {
  public static void main (String args[]) {
        Scanner SumofDigits = new Scanner(System.in); 
        System.out.println("Enter a Number");
        long userInput = SumofDigits.nextLong();
        long number=userInput;
        long sum=0;
        while (number>0)
        {
            long rem=number%10;
            sum=sum+rem;
            number=number/10;
        }
      System.out.println("The sum of the digits is "+sum+ ".");
}  
}

