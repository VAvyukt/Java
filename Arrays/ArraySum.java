/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import java.util.Scanner;

/**
 *
 * @author Nikhil.Agrawal
 */
public class ArraySum {
     public static void main (String args[]) 
    {
        Scanner ArraySum =new Scanner(System.in);
        System.out.println("Enter a range");      
        int userInput=ArraySum.nextInt();
        int array[]=new int[userInput];
        System.out.println("Enter "+userInput+" Elements");
        for (int i=0;i<userInput;i++)
        {
            array[i]=ArraySum.nextInt();
        }
        int oddSum=0;
        int evenSum=0;
        
        for (int i=0;i<userInput;i++)   
        {
            if (array[i]%2==0) 
            {
                evenSum=evenSum+(array[i]);
            }
            else 
            {
                oddSum=oddSum+(array[i]);
            }
        }
        int Sum=0;
        for (int i=0;i<userInput;i++)
        {   
           Sum=Sum+array[i];
        }
           System.out.println("The Sum of the Array Elements = "+Sum);
           System.out.println("The Sum of the Odd Array Elements = "+oddSum);
           System.out.println("The Sum of the Even Array Elements = "+evenSum);
       
    }
}
