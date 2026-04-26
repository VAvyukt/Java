/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class DayNumberOfWeek {
    public static void main (String args[]) {
        Scanner DayNumber=new Scanner(System.in);
        System.out.println("Enter a day of the week (in number form).");
        long a=DayNumber.nextLong();
        if (a==1) {
            System.out.println("Sunday");    
        }  
        else if (a==2) {
            System.out.println("Monday");       
        }
        else if (a==3) {
            System.out.println("Tuesday");   
        }
        else if (a==4) {
            System.out.println("Wednesday");
        }
        else if (a==5) {
            System.out.println("Thursday");
        }
        else if (a==6) {
            System.out.println("Friday");
        }
        else if (a==7) {
            System.out.println("Saturday");
        }
        else {
            System.out.println("Invalid");
        }
    }     
}
