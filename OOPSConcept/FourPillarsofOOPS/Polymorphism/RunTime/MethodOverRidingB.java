/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOPSConcept.FourPillarsofOOPS.Polymorphism.RunTime;

/**
 *
 * @author Nikhil.Agrawal
 */
public class MethodOverRidingB extends MethodOverRidingA
{
    @Override
    public void display()
    {
        System.out.println("This is the Child Class in Method Over Riding");
    }
    public static void main(String Args[])
    {
        MethodOverRidingB child =new MethodOverRidingB();
        child.display();
    }
}
