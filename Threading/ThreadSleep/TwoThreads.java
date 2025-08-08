/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.OOPSConcept.Threading.ThreadSleep;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;

public class TwoThreads {
    public static void main(String args[])
    {
   for(int i=0; i<5; i++)
   {
       try
       {
       System.out.println("The 1st Thread is Running at Number: "+(i+1));
       Thread.sleep(1000);
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }
   }
   System.out.println();
   System.out.println("The code is now going to sleep for 5 sec.");
   System.out.println();
   try
   {
       Thread.sleep(5000);
   }
   catch(InterruptedException e)
   {
       System.out.println(e);
   }
   for(int j=0; j<5; j++)
   {
       try
       {
       System.out.println("The 2nd Thread is Running at Number:"+(j+1));
       Thread.sleep(1000);
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }
   }
   
}
}