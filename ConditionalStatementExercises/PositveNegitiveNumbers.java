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
public class PositveNegitiveNumbers {
    public static void main (String args[]) {
        Scanner PosNeg=new Scanner(System.in);
        System.out.println("Enter a Number");
        double a=PosNeg.nextDouble();
        if(a>0) {
            System.out.println("Positve Number");}
        else if (a>0) {
            System.out.println("Negitive Number");} 
        else {
            System.out.println("You entered 0");}
}
}

