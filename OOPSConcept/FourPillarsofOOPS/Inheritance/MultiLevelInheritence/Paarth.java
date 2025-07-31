/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.OOPSConcept.FourPillarsofOOPS.Inheritance.MultiLevelInheritence;

/**
 *
 * @author Nikhil.Agrawal
 */
public class Paarth extends Papa
{
    public void tell()
    {
        System.out.println("This is Paarth Class Method");
    }
    public static void main (String args[])
    {
       Paarth paa=new Paarth();
       paa.show();
       paa.display();
       paa.tell();
       
    }

}
