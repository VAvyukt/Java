/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOPSConcept.AccessSpecifiers.College;

/**
 *
 * @author Nikhil.Agrawal
 */
public class Student 

{
public int ID=1;
public String name="Vivaan A";
//If remove public then it goes to default and it is only runnable inside this pacage so only in teacher not inMainClass
//If change it to public then from the MainClass and teacher we can run this 
//If change to private then it is only runnable only inside this student class
public void display()
{
System.out.println("My ID is " +ID);
System.out.println("My name is "+name);
}

    
}
