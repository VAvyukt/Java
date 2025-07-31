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
public class NumPattern5NL {
    public static void main (String args[]) {
        for(int i=1;i<=5;i++)  
        {
            int count=4;
            int decrement=i;
            for (int j=1;j<=i;j++) 
            {
            System.out.print(decrement +" ");
            decrement=decrement+count;
            count--;
            }
            System.out.println();
        }
    }
}
