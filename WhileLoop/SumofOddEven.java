/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.WhileLoop;

/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class SumofOddEven  {
  public static void main (String args[]) {
        Scanner SumofDigits = new Scanner(System.in); 
        System.out.println("Enter a Number");
        long userInput = SumofDigits.nextLong();
        if (userInput<0)
        {
            System.out.println("INVALID NUMBER (Less than 0)");
        }
        else {
        long evenSum=0;
        long oddSum=0;
        while (userInput>0)
        {
            long rem=userInput%10;
            if (rem%2==0)
            { 
                evenSum=evenSum+rem;
            }
            else 
            {
               oddSum=oddSum+rem; 
            }
            userInput=userInput/10;
        }   
        System.out.println("The sum of the even digits is "+evenSum+ ".");
        System.out.println("The sum of the odd digits is "+oddSum+ ".");
        }

}  
}