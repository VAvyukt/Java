/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOPSConcept.OOPSBasics;

/**
 * 
 * @author Nikhil.Agrawal
 */
public class OOPSExampleStudent
{
//    int ID=1;
//    String name="Paarth";
//    String college ="NIE";
////    int ID;
////    String name;
////    String college;
    int ID;
    String name1;
    String college;
   
    public void read(int id, String name, String college)
    {
        this.ID=ID;
        name1=name;
        this.college=college;
    }
    
    public void display()
    {
        System.out.println("My name is "+name1);
        System.out.println("My id is "+ID);
        System.out.println("My college is "+college);
    }
}
