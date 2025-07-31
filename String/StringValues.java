/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics.String;

/**
 *
 * @author Nikhil.Agrawal
 */
public class StringValues
{
    public static void main (String args[]) 
    {
        String name="Letspro";
        String name1="Letspro";
        String name2 =new String ("Letspro");
        System.out.println(name==name1);
        System.out.println(name==name2);
        System.out.println(name.equals(name2));
    }
}
