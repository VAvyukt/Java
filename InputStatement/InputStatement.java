/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InputStatement;

/**
 *
 * @author Nikhil.Agrawal
 */
import java.util.Scanner;
public class InputStatement {
    public static void main (String args[]) {
        Scanner vivaan = new Scanner(System.in);
        
//        System.out.println("Enter two Whole Numbers");
//        int a = paarth.nextInt();
//        int b = paarth.nextInt();
//        int sum=a+b;
//        System.out.println("Here is the sum of the two numbers that you entered: ");
//        System.out.println (sum);
        
////        System.out.println("Enter two decimals");
////        float a = paarth.nextFloat();
////        float b = paarth.nextFloat();
////        float sum=a+b;
////        System.out.println("Here is the sum of the two decimals that you entered: ");
////        System.out.println (sum);
        
////////        System.out.println("Enter two numbers");
////////        long a = paarth.nextLong();
////////        long b = paarth.nextLong();
////////        long sum=a+b;
////////        System.out.println("Here is the sum of the two numbers that you entered ");
////////        System.out.println (sum);
        
        System.out.println("Enter two decimals or Whole Numbers");
        double a = vivaan.nextDouble();
        double b = vivaan.nextDouble();
        double sum=a+b;
        System.out.println("Here is the sum of the two decimals that you entered ");
        System.out.println (sum);
    }
}
