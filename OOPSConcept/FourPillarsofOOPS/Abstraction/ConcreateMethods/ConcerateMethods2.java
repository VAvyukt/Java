/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOPSConcept.FourPillarsofOOPS.Abstraction.ConcreateMethods;

/**
 *
 * @author Nikhil.Agrawal
 */
public class ConcerateMethods2 extends ConcreateMethods
{
    public void tell()
    {
        System.out.println("This is tell method from concreate method");
    }
    public static void main(String args[])
    {
    ConcerateMethods2 cm=new ConcerateMethods2();
    cm.display();
    cm.tell();
    cm.show();
    }
       
}
