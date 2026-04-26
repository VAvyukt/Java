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
public class MaxNum {
     public static void main (String args[]) {
        Scanner MaxNum=new Scanner(System.in); 
        System.out.println("Enter a range");
        int userInput=MaxNum.nextInt();
        
        if (userInput<=0) 
        {
            System.out.println("INVALID ENTRY");
        }
        else {
            int max=0;
            System.out.println("Enter " +userInput+ " numbers");
            for(int c=1;c<=userInput;c++)
        {
            int num=MaxNum.nextInt();
            if (max<num) {
                max=num;
            }
        }
            System.out.println("The greatest number is "+max);
             }         
        }
}
