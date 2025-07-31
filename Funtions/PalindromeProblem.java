/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.Funtions;

import java.util.Scanner;

/**
 *
 * @author Nikhil.Agrawal
 */
public class PalindromeProblem {
    public static void main (String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        long userInput=obj.nextInt(); 
        long rev=palindrome(userInput);
        if (rev==userInput)
        {
            System.out.println("The number that you entered is a Palindrome");
        }
        else
        {
            System.out.println("The number that you entered is not a Paindrome");
        }
    }   
        public static long palindrome(long n)
        {
           long rev=0;
           while(n>0)
           { 
           long rem=n%10;
           rev=rev*10+rem;
           n=n/10;
        }
           return rev;
}
}
        
