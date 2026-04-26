/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ForLoop;

/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class EvenOddForLoop {
    public static void main (String args[]) {
        Scanner EvenOddSum=new Scanner(System.in); 
        System.out.println("Enter a range");
        int a=EvenOddSum.nextInt();
        if (a<0) {
            System.out.println("INVALID ENTRY");
        }
        else
        {
        System.out.println("The first " +a+ " numbers are: ");
        
        long evenSum=0;
        long oddSum=0;
        long sum=0;
        for (int i=1 ; i<=a ; i++) 
        {
        sum=sum+i;
        System.out.println ( i );
        if (i%2==0)   
        {
        evenSum=evenSum+i;       
        } 
        else
        {
         oddSum=oddSum+i;
        }
        }
        
    System.out.println("The sum of even = " +evenSum);
    System.out.println("The sum of odd = " +oddSum);
    System.out.println("The sum of all numbers = " +sum);
        }
    }
}
    

