/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SuperKeyword.SuperVariable;

/**
 *
 * @author Nikhil.Agrawal
 */
public class ChildSuper extends ParentSuper
{
int age=120;

public void display()
{
    System.out.println(super.age);
}
public static void main(String args[])
{
    ChildSuper cs=new ChildSuper();
    System.out.println(cs.age);
    cs.display();
}
}