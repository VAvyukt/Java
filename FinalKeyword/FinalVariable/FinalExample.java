/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.FinalKeyword.FinalVariable;

/**
 *
 * @author Nikhil.Agrawal
 */
public class FinalExample
{  
    public static void main(String args[])
    {
        final int a =10;
        // When you put final then you cannot increment or decemnt the variable so a++; is not allowed.
        System.out.println(a);
    }    
}
