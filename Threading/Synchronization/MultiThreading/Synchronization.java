/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Threading.Synchronization.MultiThreading;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;

// Class that encapsulates a shared counter with thread-safe incrementing
class Counter 
    {
        private int count=0;
    
    // Only one thread at a time can execute this method
    // Prevents race conditions when multiple threads modify 'count'
    public synchronized void increment()
    {
        count++;
    }
    // Returns the current value of the counter
    public int getCount()
    {
    return count;
    }
}

// A thread class that increments the shared counter
class CountThread extends Thread
{
    private Counter counter;
    // Constructor takes a shared Counter object
    public CountThread(Counter counter)
    {
        this.counter=counter;
    }
    
    // The code that runs when the thread starts
    public void run()
    {
        System.out.println("Running the Thread "+Thread.currentThread().getName());
        // Each thread increments 100 times on the Counter
        for(int i=0; i<5000; i++)
        {
            counter.increment();
        }
    }
}

public class Synchronization { 
public static void main(String args[])
{

    // Create a shared Counter object to be used by all threads
    Counter counter=new Counter();
    
    // Create three threads, all sharing the same Counter
    Thread t1=new CountThread(counter);
    Thread t2=new CountThread(counter);
    Thread t3=new CountThread(counter);
    
    // Start all three threads (they run at the same time)
    t1.start();
    t2.start();
    t3.start();
    
    try
    {
        // Wait for all threads to complete before printing the final result
        t1.join();  // Wait for t1 to finish
        t2.join();  // Wait for t2 to finish
        t3.join();  // Wait for t3 to finish
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
    }
     // After all threads finish, print the final counter value
     // Expected: 3 threads x n increments = 3n
    System.out.println("Total Count "+counter.getCount());
}
}