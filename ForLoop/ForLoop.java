/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.ForLoop;

/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class ForLoop {
    public static void main (String args[]) {
        Scanner ForLoop=new Scanner(System.in); 
        System.out.println("Enter a range");
        int a=ForLoop.nextInt();
        System.out.println("The first " +a+ " numbers are: ");
        int sum=0;
        for (int i=1 ; i<=a ; i++) 
        {
        System.out.println ( i );
        sum=sum+i;     
        }
    System.out.println("The Sum is " +sum);
}
}