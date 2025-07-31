/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.WhileLoop;

import java.util.Scanner;

/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class ReverseNumberPrinting {
  public static void main (String args[]) {
        Scanner SumofDigits = new Scanner(System.in); 
        System.out.println("Enter a Positive Number");
        long userInput = SumofDigits.nextLong();
        if (userInput<0)
        {
            System.out.println("INVALID NUMBER (Less than 0)");
        }
        else {
        long rev=0;
        while (userInput>0)
        {
            long rem=userInput%10;
            rev=(rev*10)+rem;
            userInput=userInput/10;
        }   
        System.out.println("The reverse number is "+rev+ ".");
        }

}  
}