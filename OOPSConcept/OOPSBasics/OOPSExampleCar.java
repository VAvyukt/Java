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
public class OOPSExampleCar {
    String company;
    int wheel;
    int door;
    int mil;
    int speed;
    
    OOPSExampleCar(int wheel,int door, String company)
    {
        this.wheel=wheel;
        this.door=door;
        this.company=company;
    }
    
    public void details(int mil,int speed)
    {
        this.mil=mil;
        this.speed=speed;
    }
    public void display()
    {
        System.out.println("My car has "+wheel+ " wheels.");
        System.out.println("My car has "+door+ " doors.");
        System.out.println("My car brand is "+company+ " .");
        System.out.println("My car has "+mil+ " lakh kilometers milage.");
        System.out.println("My car is going at "+speed+ " kilometers per hour.");
    }
    public static void main(String args[])
    {
        OOPSExampleCar tataMoters=new OOPSExampleCar(4,4,"TataMoters");
        tataMoters.details(20,200);
        tataMoters.display();
    }
            
}

