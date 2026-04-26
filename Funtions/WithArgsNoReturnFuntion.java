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
public class WithArgsNoReturnFuntion 
{
    public static void main(String args[])
    {
        System.out.println("This is (2) funtion with arguments and no return type");
        int a=10;
        int b=20;
        addition(a,b);
    }   
     public static void addition(int x,int y)
        {
            int sum=x+y;
            System.out.println(sum);
        }   
}