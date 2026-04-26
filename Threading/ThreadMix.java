/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Threading;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.*;

class ThreadExtendsMix extends Thread
{
    public void run()
    {
     System.out.println ("This is the Extends Thread");   
    }
}

class ThreadImplementsMix implements Runnable
{
    public void run()
    {
        System.out.println("This is the Implements Thread");
    }
}

public class ThreadMix {
   public static void main(String args[])
   {
       
    ThreadExtendsMix et1=new ThreadExtendsMix();
    ThreadImplementsMix g1=new ThreadImplementsMix();
    Thread it1=new Thread(g1);
    et1.start();
    it1.start();
    try
    {
        et1.join();
        it1.join();
    }
    catch (Exception e)
    {
        System.out.println(e);
    }
   }
}
