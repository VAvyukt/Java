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
public class ForLoopsExercises {
    public static void main (String args[]) {
        Scanner ForLoopsExercises=new Scanner(System.in); 
        System.out.println("Enter a range");
        int userInput=ForLoopsExercises.nextInt();
        
        if (userInput<=0) 
        {
            System.out.println("INVALID ENTRY");
        }
        else
        {
        System.out.println("Enter " +userInput+ " numbers");
        long evenSum=0;
        long oddSum=0;
        long sum=0;
        for(int c=1;c<=userInput;c++)
        {
        int num=ForLoopsExercises.nextInt();        
        sum=sum+c;
        
        if (num%2==0)   
        {
        evenSum=evenSum+c;       
        } 
        else
        {
         oddSum=oddSum+c;
        }
        }
        
    System.out.println("The sum of even = " +evenSum);
    System.out.println("The sum of odd = " +oddSum);
    System.out.println("The sum of all numbers = " +sum);
        }
    }
}
