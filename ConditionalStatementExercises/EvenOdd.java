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
public class EvenOdd {
     public static void main (String args[]) {
     Scanner EvenOdd=new Scanner(System.in);  
     System.out.println("Enter a Number");
     long a=EvenOdd.nextLong();
     if (a%2==0){
         System.out.println("Even Number");}
     else { 
         System.out.println("Odd Number");}
     
}
}
