/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.SwitchExercises;

/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class CalculatorSwitch {
    public static void main (String args[]) {
        Scanner CalcSwitch=new Scanner(System.in); 
        System.out.println("Enter Two Numbers");
        int a=CalcSwitch.nextInt();
        int b=CalcSwitch.nextInt();
        System.out.println("Enter a Operator");
        CalcSwitch.nextLine();
        char c=CalcSwitch.nextLine().charAt(0);
        switch(c) {
            case '+': System.out.println("The sum of "+a+ " and " +b+ " is " +(a+b));
            break;
            case '-': System.out.println("The differnence of "+a+ " and "+b+ " is " +(a-b)+ ".");
            break;
            case '*': System.out.println("The product of "+a+ " and " +b+ " is " +(a*b)+".");
            break;  
            case '/': System.out.println("The quotioent of "+a+ " and " +b+ " is " +(a/b)+".");
            break;
            case '%': System.out.println("The modulus of "+a+ " and " +b+ " is " +(a%b)+ ".");
            break;     
            default: System.out.println("Invalid");
        }

        
    }
        
}
    

