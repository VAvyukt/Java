/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOPSConcept.FourPillarsofOOPS.Inheritance.MultiLevelInheritence;

/**
 *
 * @author Nikhil.Agrawal
 */
public class Vivaan extends Papa
{
    public void tell()
    {
        System.out.println("This is Paarth Class Method");
    }
    public static void main (String args[])
    {
       Vivaan vaa=new Vivaan();
       vaa.show();
       vaa.display();
       vaa.tell();
       
    }

}
