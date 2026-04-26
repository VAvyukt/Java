/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class ConditionalStatements {
     public static void main (String args[]) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter a Number");
        double a=number.nextDouble();
        if(a==10) {
            System.out.println("Hi");}
        else {
            System.out.println("Bye");}
     }
}