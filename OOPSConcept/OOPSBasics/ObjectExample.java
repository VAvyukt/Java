/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.OOPSConcept.OOPSBasics;

import JavaBasics.OOPSConcept.OOPSBasics.OOPSExampleStudent;

/**
 *
 * @author Nikhil.Agrawal
 */
public class ObjectExample {
    public static void main(String args[])
    {
//        OOPSExampleStudent std=new OOPSExampleStudent();
//        std.display();
////        OOPSExampleStudent obj=new OOPSExampleStudent();
////        obj.display();
////        obj.ID=2;
////        obj.name="Paarth the Great.";
////        obj.college="IIT.";
////        obj.display();
        OOPSExampleStudent std=new OOPSExampleStudent();
        std.read(1, "Paarth the Greatest", "IIT");
        std.display();
    }
}
