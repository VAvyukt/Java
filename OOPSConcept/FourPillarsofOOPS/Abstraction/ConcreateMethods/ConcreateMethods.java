/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.OOPSConcept.FourPillarsofOOPS.Abstraction.ConcreateMethods;

/**
 *
 * @author Nikhil.Agrawal
 */
abstract class demo
{
    public void display()
    {
        System.out.println("This is a concrete method");
    }
    abstract void show();
    abstract void tell();
}

public abstract class ConcreateMethods extends demo
{
    @Override
    public void show()
    {
        System.out.println("This is defintion");
    }
}