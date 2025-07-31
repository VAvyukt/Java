/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.ForLoop;

import java.util.Scanner;

/**
 *
 * @author Nikhil.Agrawal
 */
public class ArmstongNumbersinForLoop {
    public static void main (String args[]) {
        Scanner EvenOddSum=new Scanner(System.in); 
        System.out.println("Enter a range");
        int userInput=EvenOddSum.nextInt();
        if (userInput<0) {
            System.out.println("INVALID ENTRY");
        }
        else
        {
        
        System.out.println("The armstrong numbers within " +userInput+ " are: ");
        for (int i=1; i<=userInput ; i++) 
        {
             long sum=0;
             long n=i;
        while (n>0)
        {
            long cube=n%10;
            sum=(cube*cube*cube)+sum;
            n=n/10;
        }
            if (sum==i)
            {
            System.out.println(sum);
            
        }  
       
        }
        }
    }
}