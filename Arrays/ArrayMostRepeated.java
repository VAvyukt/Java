/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasics.Arrays;
import java.util.Scanner;
/**
 *
 * @author Nikhil.Agrawal
 */
public class ArrayMostRepeated {
    public static void main (String args[]) 
    {
        Scanner ArrayMostRepeated =new Scanner(System.in);
        System.out.println("Enter a range");      
        int userInput=ArrayMostRepeated.nextInt();
        int array[]=new int[userInput];
        System.out.println("Enter "+userInput+" Eelement(s)");  
        for (int i=0;i<userInput;i++)
        {
            array[i]=ArrayMostRepeated.nextInt();
        }
        int max=0;
        int element=0;
        for (int i=0;i<userInput;i++)  
        {
            int count=0;
            for (int j=i;j<userInput;j++)
            {
                
                if (array[i]==array[j])
                {
                    
                    count++;
                }
                
            }
            
            if(max<=count && element<array[i])
            {
                max=count;
                element=array[i];
            }  
        }
        System.out.println("The greates number is " +element+ " and it's repeated "+max+ " time(s).");
    }  
}
