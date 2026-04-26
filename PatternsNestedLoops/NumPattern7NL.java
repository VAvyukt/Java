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
public class NumPattern7NL {
    public static void main (String args[]) {
        for(int i=1;i<=5;i++)   
        {
            for (int j=i;j<i+i;j++) 
            {
             System.out.print(j%2);
            }
            System.out.println();
        }
    }
}
