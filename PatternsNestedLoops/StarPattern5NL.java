/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.PatternsNestedLoops;

/**
 *
 * @author Nikhil.Agrawal
 */
public class StarPattern5NL {
    public static void main (String args[]) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
               if (i==3 || j==3) 
               {
                System.out.print("*");
            }
               else 
            {
            System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
}
