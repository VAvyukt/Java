/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String;

/**
 *
 * @author Nikhil.Agrawal
 */
public class BuiltinFuntionsofStrings {
    public static void main (String args[]) 
    {
        String name ="This is Lenght Funtion";
        int len=name.length();
        System.out.println("Lenght of String is "+len);
        System.out.println("");
        
        String CAT= "This is the CharAT Funtion";
        int cAT=CAT.charAt(0);
        System.out.println("The ASCII number for letter T is " +cAT);
        System.out.println("");
        
        String name1="Paarth";
        String name2=new String("Paarth");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println("");
        
        String paarth="name";
        String paarth1="Name";
        System.out.println(paarth==paarth1);
        System.out.println(paarth.equalsIgnoreCase(paarth1));
        System.out.println("");
        
        String a="a";
        String b="b";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(a));
        System.out.println("");

        String funtion="lower case";
        String funtion1="UPPER CASE";
        System.out.println(funtion.toUpperCase());
        System.out.println(funtion1.toLowerCase());
        System.out.println("");

        String charArray="to(charArray())";
        char arr[]=charArray.toCharArray();
        for(char ar: arr)
        {
            System.out.print(ar);
        }
        System.out.println("");

    }
}
