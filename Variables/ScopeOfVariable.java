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
public class ScopeOfVariable {
    
    public static void main (String args[]) {
        
        int a=10;
        System.out.println(a);
        {
            a = 20;
            int b = 20;
            System.out.println(a);
            System.out.println(b);
        }
        int b=50;
        System.out.println(a);
        System.out.println(b);
    }
    
}
