/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SuperKeyword.SuperMethod;

/**
 *
 * @author Nikhil.Agrawal
 */
public class ChildMethod extends ParentMethod
{
    public void show()
    {
        System.out.println("This is Child Class Method");
          super.display();
    }
    public static void main (String args[])
    {
        ChildMethod cm =new ChildMethod();
        cm.show();
      
    }
}