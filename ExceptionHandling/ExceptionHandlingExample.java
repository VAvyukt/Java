/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExceptionHandling;

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
            System.out.println("In math, dividing by 0 is undefined.");
        }
        System.out.println("Bye!");
    }
}
