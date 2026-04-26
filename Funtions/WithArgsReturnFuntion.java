/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funtions;

/**
 *
 * @author Nikhil.Agrawal
 */
public class WithArgsReturnFuntion 
{
    public static void main(String args[])
    {
        System.out.println("This is (4) funtion with arguments and return type");
        int a=10;
        int b=20;
        int sum = addition(a,b);
        long sumOfSum = sum+sum;
        System.out.println("The Sum of the Sum is: " + sumOfSum);
    }   
     public static int addition(int x,int y)
        {
            int sum=x+y;
            System.out.println(sum);
            return sum;
        }   
}
