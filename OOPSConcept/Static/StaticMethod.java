/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.OOPSConcept.Static;

/**
 *
 * @author Nikhil.Agrawal
 */
public class StaticMethod 
{
    public static void abc()
    {
        System.out.println("Welcome");
    }
    public void display()
    {
    System.out.println("Hi");   
    }
    public static void show()
    {
        System.out.println("Hello");
        abc();
    }
    public static void main(String args[])
    {
        StaticMethod sm=new StaticMethod();
        sm.display();
        show();
    }
}
