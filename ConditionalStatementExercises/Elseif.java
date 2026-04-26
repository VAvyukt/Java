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
public class Elseif {
    public static void main (String args[]) {
        Scanner ElseIf=new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        long a=ElseIf.nextLong();
        long b=ElseIf.nextLong();
        long c=ElseIf.nextLong();
        if (a>b && a>c) {
            System.out.println(a+" is greatest number that you entered.");
        }
        else if (b>a && b>c) {
            System.out.println(b+" is greatest number that you entered.");
        }
        else if (c>a && c>b) {
            System.out.println(c+" is greatest number that you entered.");
        }
        else if  (a==b && b==c && a==c) {
            System.out.println("All of the numbers that you entered are the same.");
        }
        else if (a==b) {
            System.out.println(a+" is equal to "+b+ " which is also the greatest number");
        }
        else if (a==c){
            System.out.println(a+" is equal to "+c+ " which is also the greatest number");  
        }
        else {
            System.out.println(b+" is equal to "+c+ " which is also the greatest number");
        }
            

    }
}
