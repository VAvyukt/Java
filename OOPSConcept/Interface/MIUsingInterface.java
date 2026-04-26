/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOPSConcept.Interface;

/**
 *
 * @author Nikhil.Agrawal
 */
interface A
{
    abstract void display();
}
interface B
{
    abstract void display(); 
}

public class MIUsingInterface implements A,B
{
    public void display()
    {
        System.out.println("This is Multiple Inheritence using Interface");
    }
    public static void main (String args[])
    {
    A mi=new MIUsingInterface();
    mi.display();
    }
    
}
