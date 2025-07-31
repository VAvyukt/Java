/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.Arrays;

import java.util.Scanner;

/**
 *
 * @author Nikhil.Agrawal
 */
public class ArraySmallestBiggest {
     public static void main (String args[]) 
    {
        int bigNum=0;
        Scanner ArraySmallestBiggest =new Scanner(System.in);
        System.out.println("Enter a range");      
        int userInput=ArraySmallestBiggest.nextInt();
        int array[]=new int[userInput];
        System.out.println("Enter "+userInput+" Eelements");  
        for (int i=0;i<userInput;i++)
        {
            array[i]=ArraySmallestBiggest.nextInt();
        }
        int smallNum=array[1];
        System.out.println("Enter a Key Element:");
        for (int i=0;i<userInput;i++)   
        {
            
            if (smallNum>=array[i])
            {
                smallNum=array[i];
            }
            if (bigNum<array[i]) 
            {
                bigNum=array[i];
            }
        }
            System.out.println("The Biggest Number = "+bigNum);
            System.out.println("The Smallest Number = "+smallNum);
    }
}