/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FinalKeyword.FinalMethod;

/**
 *
 * @author Nikhil.Agrawal
 */

    public class FinalChild extends FinalParent
{
    public void display(); //There is an error here because the display() method is final.
    public void show()
    {
        System.out.println("This is Child Class Method");
    }
    public static void main (String args[])
    {
        FinalChild fc =new FinalChild();
        fc.show();
        fc.display(); 
    }
}

