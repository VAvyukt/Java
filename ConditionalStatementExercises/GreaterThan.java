/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.ConditionalStatementExercises;

/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class GreaterThan {
    public static void main (String args[]) {
        Scanner GreaterThan=new Scanner(System.in); 
        System.out.println("Enter two Numbers");
        long a=GreaterThan.nextLong();
        long b=GreaterThan.nextLong();
        if (a>b){
            System.out.println(a+ " is greater than "+b);
        }
        else if (a<b) {
            System.out.println(b+ " is greater than "+a);
        }
        else{
            System.out.println(a+ " is equal to "+b);

        }
            
    }
}