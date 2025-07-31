/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.Operators;

/**
 *
 * @author Nikhil.Agrawal
 */
public class LogicalOperators {
        public static void main (String args[]) {
           int a=10;
           int b=12;
           int c=12;
           System.out.println((a>b)&&(a<c));
           System.out.println((a>b)||(a<c));
           System.out.println(!(a>b));
           int d=10;
           int e=20;
           int f=10;
           System.out.println((d>e)&&(d<f));
           System.out.println((d>e)||(d<f));
           System.out.println(!(d>e)); 
        }  
}
