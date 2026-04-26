/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Threading.ThreadPools;

/**
 *
 * @author Admin
 */
import java.util.concurrent.*;
public class ThreadPoolsExample 
{
    public static void main(String args[]) throws InterruptedException
    {
        ExecutorService pool= Executors.newFixedThreadPool(100);
        try{
        for(int i=1; i<=100; i++)
        {
            int id=i;
            pool.execute(()-> System.out.println("Task "+id+" on "+Thread.currentThread().getName()));
            Thread.sleep(0,1);
            
        }
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.SECONDS);
    }
        catch(InterruptedException e)
        {
            
        }
    }
}