/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WhileLoop;

import java.util.Scanner;

/**
 *
 * @author Nikhil.Agrawal
 */
public class PalindromeDetector {
      public static void main (String args[]) {
        Scanner SumofDigits = new Scanner(System.in); 
        System.out.println("Enter a Positive Number");
        long userInput = SumofDigits.nextLong();
        
        if (userInput<0)
        {
            System.out.println("INVALID NUMBER (Less than 0)");
        }
        else {
        long temp=userInput;
        long plaindrome=0;
        while (userInput>0)
        {
            long rem=userInput%10;
            plaindrome=(plaindrome*10)+rem;
            userInput=userInput/10;
        }   
        if (plaindrome==temp) 
        {
            System.out.println(temp+ " is a plaindrome");
        }
        else 
        {
            System.out.println(temp+ " is not a plaindrome");
        } 
        }

}
}
