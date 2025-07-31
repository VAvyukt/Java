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
public class ExceptionalHandlingArray
{
    public static void main(String args[])
    {
        try
        {
            int a[]={10,10,30};
            for(int i=0;i<=3;i++)
            {
                System.out.println(a[i]);
            }
        }
        catch (Exception e)
            {
            System.out.println(e);
            }
        }
    }