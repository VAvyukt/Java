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
public class ExercisewArray 
{
     public static void main (String args[]) 
    {
        Scanner ExercisewArray =new Scanner(System.in);
        System.out.println("Enter a String");
        String len=ExercisewArray.nextLine();
        char arr[]=len.toCharArray();
        int count=0;
        for (char a: arr)
        {
            count++;
            
        }
        System.out.println("The length of string is "+count);
    }
}
