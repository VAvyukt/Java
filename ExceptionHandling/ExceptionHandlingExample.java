/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.ExceptionHandling;

/**
 *
 * @author Nikhil.Agrawal
 */
public class ExceptionHandlingExample
{
    public static void main(String atgs[])
    {
        try
        {
        int a = 10; 
        int b = 0;
        int div = a/b;
        System.out.println("Quotent of A(10) and B(5) is "+div);
        }
        catch(Exception e)
        {
        System.out.println("Divided 0 is not accepted");
        }
        System.out.println("Hi,Hello");
    }
}
