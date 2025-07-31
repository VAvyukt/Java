/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.OOPSConcept.FourPillarsofOOPS.Polymorphism.CompileTime;

/**
 *
 * @author Nikhil.Agrawal
 */
public class MainClass {
    public static void main(String args[])
    {
        MethodOverLoading mo=new MethodOverLoading();
        mo.add();
        mo.add(10);
        mo.add(10,20);
        mo.add(20.0f);
        mo.add(10,20.0f);
    }
}

