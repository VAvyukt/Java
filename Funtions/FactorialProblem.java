/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funtions;

import java.util.Scanner;

/**
 *
 * @author Nikhil.Agrawal
 */
public class FactorialProblem {
    public static void main (String args[]) 
    {
        Scanner Factorials=new Scanner(System.in);
        System.out.println("Enter a number");
        long userInput=Factorials.nextInt(); 
        factorial(userInput);
    }
    public static long factorial(long y)
    {
            long facNum=1;
            for(long a=1;a<=y;a++) 
        {
            facNum=facNum*a;
                    
        }   
            System.out.println(y+ " factorial is " +facNum);
        return facNum;
    }
}