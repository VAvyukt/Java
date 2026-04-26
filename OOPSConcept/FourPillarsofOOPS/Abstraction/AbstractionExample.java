/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOPSConcept.FourPillarsofOOPS.Abstraction;

/**
 *
 * @author Nikhil.Agrawal
 */

abstract class AbstractDemo
{
abstract void display();
//abrstract cannnot have a body
}
public class AbstractionExample extends AbstractDemo

{
    @Override
    public void display()
    {
        System.out.println("This is Abstact Method  of Definition");
    }
    public static void main (String args[])
    {
     // AbstractDemo obj=new AbstractDemo();  
     // This will show error becuase you cannot creat object for abstract in class
        AbstractDemo obj= new AbstractionExample();
        obj.display();
    }
    
}
