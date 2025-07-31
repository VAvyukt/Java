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
public class NumPattern3NL {
    public static void main (String args[]) {
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j>=1;j--) 
            {
             System.out.print(j);
            
        }
            System.out.println();
        }
    }
}
