/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.OOPSConcept.FourPillarsofOOPS.Encapsulation;

/**
 *
 * @author Nikhil.Agrawal
 */
public class MainClass 
{
    public static void main(String args[])
    {
        EncapsulationExample ec=new EncapsulationExample();
        ec.setID(1);
        ec.setPhone("+95 53452 35632");
        ec.setName("Paarth");
        ec.setPassword("PaaswordequalsLetsproJava#!!!");
        int id=ec.getID();
        String phone=ec.getPassword();
        String password=ec.getPhone();
        String name=ec.getName();
        System.out.println(id);
        System.out.println(name);
        System.out.println(password);
        System.out.println(phone);

    }
}
