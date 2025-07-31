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
public class RangeProblem {
    public static void main (String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput=obj.nextInt(); 
        
        System.out.println("Enter "+userInput+ " number(s)");
        int array[]=new int[userInput];
       
        for (int i=0 ; i<userInput; i++)
        {
            array[i]=obj.nextInt();
        }
        System.out.println("Enter a Key Element");
        int userKeyElement=obj.nextInt();
        int range=search(userKeyElement ,array,userInput);  
        if (range>1)
        {
        System.out.println("The Key Element is at position "+range+".");
        }
        else
        {
            System.out.println("Key Element not Found");
        }
    }
    public static int search(int key, int a[],int size) 
    {
        int position=0;
        for (int i=0;i<size;i++)  
        {
            
            if (key==a[i])
            {
                position=i+1;
            } 
            
        }
       return position; 
    }
}