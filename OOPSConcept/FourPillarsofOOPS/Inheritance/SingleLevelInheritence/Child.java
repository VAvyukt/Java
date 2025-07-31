/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.OOPSConcept.FourPillarsofOOPS.Inheritance.SingleLevelInheritence;

/**
 *
 * @author Nikhil.Agrawal
 */
public class Child extends Parent
{
    public void show()
    {
        System.out.println("This is Child Class Method");
    }
    public static void main (String args[])
    {
        Child cd =new Child();
        cd.show();
        cd.display();
    }
}
