/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String;

import java.util.Scanner;

/**
 *
 * @author Nikhil.Agrawal
 */
public class UpperCaseWithoutBuiltinFuntion 
{
    public static void main (String args[]) 
    {
        Scanner UpperCase =new Scanner(System.in);
        System.out.println("Enter a String");
        String UC=UpperCase.nextLine();
        String upper="";
        char arr[]=UC.toCharArray();
        for(char i:arr)
        {
          if (i>='a'&& i<='z') 
          {
           i=(char)(i-32);
           System.out.print(i);
          }
        }
    }
}