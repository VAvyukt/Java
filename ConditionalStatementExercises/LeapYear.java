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
public class LeapYear {
    public static void main (String args[]) {
        Scanner LeapYear=new Scanner(System.in);
        System.out.println("Enter a Year");
        long a=LeapYear.nextLong();
        if (((a%4==0)&&(a%100!=0)) ||(a%400==0)) 
        {
            System.out.println("Leap Year");}
        else {
        System.out.println("Not a Leap Year");}
    }   
    
}
   