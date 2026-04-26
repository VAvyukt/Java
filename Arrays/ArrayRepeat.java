/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;
import java.util.Scanner;
/**
 *
 * @author Nikhil.Agrawal
 */
public class ArrayRepeat 
{
    public static void main (String args[]) 
    {
        Scanner ArrayRepeat =new Scanner(System.in);
        System.out.println("Enter a range");      
        int userInput=ArrayRepeat.nextInt();
        int array[]=new int[userInput];
        System.out.println("Enter "+userInput+" Element(s)");  
        for (int i=0;i<userInput;i++)
        {
            array[i]=ArrayRepeat.nextInt();
        }
        System.out.println("Enter a Key Element:");
        int keyElement=ArrayRepeat.nextInt();
        int repeat=0;
        for (int i=0;i<userInput;i++)  
        {
            
            if (keyElement==array[i])
            {
                repeat=repeat+1;
            } 
            
        }
        System.out.println("The Key Element is repeated "+repeat+" time(s)");
    }
}  
