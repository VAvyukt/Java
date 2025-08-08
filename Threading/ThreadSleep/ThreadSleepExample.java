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
public class ThreadSleepExample {
    public static void main(String args[])
    {
        for(int i=0; i<5; i++)
        {
            try {
            System.out.println("Number: "+(i+1));
            Thread.sleep(1000); //Makes the program wait x ms=x/1000 sec before printing each number.
        }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
    }
}
}
