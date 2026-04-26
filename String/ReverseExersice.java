/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;
import java.util.Scanner;
/**
 *
 * @author Nikhil.Agrawal
 */
public class ReverseExersice
{
     public static void main (String args[]) 
    {
        Scanner ReverseExersice =new Scanner(System.in);
        System.out.println("Enter a String");
        String rev=ReverseExersice.nextLine();
        String name="";
        for(int i=rev.length()-1;i>=0;i--)
        {
            name=name+rev.charAt(i);
        }
        System.out.println("The Reverse String is " +name);
        if (name.equals(rev))
        {
            System.out.println("This is a palindrome");
        }
        else
        {
            System.out.println("This is not a palindrome");
        }
    }
}