package JavaBasics.SwitchExercises;

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
public class SwitchExericise {
    public static void main (String args[]) {
        Scanner SwitchExercise=new Scanner(System.in);
        System.out.println("Enter a day of the week number.");
        int a=SwitchExercise.nextInt();
        switch(a) {
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;  
            case 4: System.out.println("Wednesday");
            break;                
            case 5: System.out.println("Thursday");
            break;                
            case 6: System.out.println("Friday");
            break;                
            case 7: System.out.println("Saterday");
            break;                
            default: System.out.println("Invalid");
        }


    }
 
}
