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
public class NumPattern6NL {
    public static void main (String args[]) 
    {
        for(int i=1;i<=5;i++)
        {
            int count=i;
            for (int j=1;j<=5; j++) 
            {
            System.out.print(count%5);
            count++;
            }
            System.out.println();   
        }   
    }    
}