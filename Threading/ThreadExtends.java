/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.OOPSConcept.Threading;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.*;

class Threading extends Thread
{
    public void run()
    {
        System.out.println("The extends thread is running");
    }
}
        
public class ThreadExtends {
    public static void main(String args[])
    {
        Threading t1=new Threading();
        Threading t2=new Threading();
        Threading t3=new Threading();
        t1.start();
        t2.start();
        t3.start();
    }
    
}
