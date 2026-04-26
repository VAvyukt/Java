/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PatternsNestedLoops;

/**
 *
 * @author Nikhil.Agrawal
 */
public class NumPattern4NL {
    public static void main (String args[]) {
        int count=1;
        for(int i=1;i<=5;i++)  
        {
            for (int j=1;j<=i; j++) 
            {
             System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
