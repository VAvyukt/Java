/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.Variables;

/**
 *
 * @author Nikhil.Agrawal
 */
public class SwappingTwoVariables {
     public static void main (String args[]) {
         int a=10;
         int b=20;
         System.out.println("Before Swap");
         System.out.println("a = "+a);
         System.out.println("b = "+b);
//         System.out.println("First Approach");
//         int temp = a
//         a=b;
//         b=temp;
///         System.out.println("Second Approach");
///         b=b-a;
///         a=b+b;
////         System.out.println("Real Approach");
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("After Swap");
         System.out.println("a = "+a);
         System.out.println("b = "+b);
     } 
}
   

