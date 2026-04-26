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
public class WithoutArgsNoReturnFuntion 
{
    public static void main(String args[])
    {
        System.out.println("This is (1) funtion without arguments and no return type");
        addition();
    }
        public static void addition()
        {
            int a =10;
            int b =20;
            int sum=a+b;
            System.out.println("The sum of a(10) and b(20) is: "+sum);
        }
}