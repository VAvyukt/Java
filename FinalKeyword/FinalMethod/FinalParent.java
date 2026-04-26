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

public class FinalParent
{
    public final void display()
    //When we add final as a method when we try to create more displays it is not allowing because it is a final method.
    {
    System.out.println("This is Parent Class Method");
    }
}    