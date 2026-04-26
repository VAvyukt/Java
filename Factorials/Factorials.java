/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factorials;

/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class Factorials {
    public static void main (String args[]) 
    {
        Scanner Factorials=new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int userInput=Factorials.nextInt();
        if (userInput<=0) 
        {
            System.out.println("INVALID ENTRY");
        }
        else 
        {
            long facNum=1;
            for(long a=1;a<=userInput;a++) 
        {
            facNum=facNum*a;
                    
        }   
            System.out.println(userInput+ " factorial is " +facNum);
        }
    }             
}
