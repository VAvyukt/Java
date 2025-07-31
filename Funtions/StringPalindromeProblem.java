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
public class StringPalindromeProblem {
    public static void main (String args[]) 
    {
        Scanner ReveseExercise =new Scanner(System.in);
        System.out.println("Enter a String");
        String rev=ReveseExercise.nextLine();
        String palinfunc=search(rev);
        System.out.println("The Reverse String is: " +palinfunc);
        if (palinfunc.equals(rev))
        {
            System.out.println("This is a palindrome.");
        }
        else
        {
            System.out.println("This is not a palindrome.");
        }
    }
    public static String search(String a)
    {
        String name="";
        for(int i=a.length()-1;i>=0;i--)
        {
            name=name+a.charAt(i);
        }
        return (name);
    }
}
