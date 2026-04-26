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
public class ArmstrongNumberDectector {
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
            long sum=0;
        while (userInput>0)
        {
            long cube=userInput%10;
            sum=(cube*cube*cube)+sum;
            userInput=userInput/10;
        }   
        if (sum==temp) 
        {
            System.out.println(temp+" is a armstrong number");
        }
        else 
        {
            System.out.println(temp+ " is not a armstrong number");
        } 
        }

}
}
