/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.Funtions;

/**
 *
 * @author Nikhil.Agrawal
 */
public class WithoutArgsReturnFuntion 
{
    public static void main(String args[])
    {
        System.out.println("This is (3) funtion without arguments and return type");
        addition();
    }   
     public static int addition()
        {
            int a=10;
            int b=20;
            int sum=a+b;
            System.out.println(sum);
            return sum;
        }   
}


