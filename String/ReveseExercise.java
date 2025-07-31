/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasics.String;
import java.util.Scanner;
/**
 *
 * @author Nikhil.Agrawal
 */
public class ReveseExercise
{
     public static void main (String args[]) 
    {
        Scanner ReveseExercise =new Scanner(System.in);
        System.out.println("Enter a String");
        String rev=ReveseExercise.nextLine();
        String name="";
        for(int i=rev.length()-1;i>=0;i--)
        {
            name=name+rev.charAt(i);
        }
        System.out.println("The Reverse String is " +name);
        if (name.equals(rev))
        {
            System.out.println("This is a palendrome");
        }
        else
        {
            System.out.println("This is not a plendrome");
        }
    }
}