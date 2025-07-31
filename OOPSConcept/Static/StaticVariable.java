/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.OOPSConcept.Static;

/**
 *
 * @author Nikhil.Agrawal
 */
public class StaticVariable 
{
    //Putting static here tells the computer that the same memory for each iteration 
    static int count=0;
    StaticVariable()
    {
        count ++;
        System.out.println(count);
    }
    public static void main(String args[])
    {
        StaticVariable sv=new StaticVariable();
        StaticVariable sv1=new StaticVariable();
        StaticVariable sv2=new StaticVariable();
                
    }
}
