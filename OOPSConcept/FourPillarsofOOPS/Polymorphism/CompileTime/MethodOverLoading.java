/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOPSConcept.FourPillarsofOOPS.Polymorphism.CompileTime;

/**
 *
 * @author Nikhil.Agrawal
 */
public class MethodOverLoading {
    public void add()
    {
        System.out.println("No Argument");
    }
    
    public void add(int a)
    {
        System.out.println("One Integer Argument");
    }
    
    public void add(int a,int b)
    {
        System.out.println("Two Integer Arguments");
    }
    
    public void add(float b) //if you type "int b", it will overload the function and give an error message.
    {
        System.out.println("One Float Argument");
    }
    public void add(int a,float b)
    {
        System.out.println("One Integer Argument and One Float Argument");
    }
}