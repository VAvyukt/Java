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

class MyThreading implements Runnable {
    public void run()
    {
        System.out.println("The Implements Thread is Running");
    }
}

public class ThreadImplement {
    public static void main(String args[])
    {
        MyThreading g1=new MyThreading();
        Thread t1=new Thread(g1);
        Thread t2=new Thread(g1);
        Thread t3=new Thread(g1);
        t1.start();
        t2.start();
        t3.start();
    }
}
