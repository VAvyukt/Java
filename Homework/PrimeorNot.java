/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.Homework;

/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class PrimeorNot {
        public static void main (String args[]) {
        Scanner PrimeorNot=new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput=PrimeorNot.nextInt();
        boolean prime=true;
        if (userInput<=0) 
        {
            System.out.println("INVALID ENTRY");
        }
        else
        {
            for (long i=2;i<=Math.sqrt(userInput);i++) 
            {
            if (userInput%i==0) {
               prime=false;
            }
            }
            if (prime) 
            {
                System.out.println(userInput+ " is a prime number.");
  
            }
            else 
            {
               System.out.println(userInput+ " is not a prime number.");
            }
        }   
    }
}

