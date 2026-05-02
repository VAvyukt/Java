/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Nikhil.Agrawal
 */
public class ExceptionHandlingExample
{
    public static void main(String atgs[])
    {
        FileReader reader = null;
        try
        {
            int a = 10; 
            int b = 0;
            int div = a/b;
            System.out.println("Quotent of A(10) and B(5) is "+div);
        }
        catch(Exception e)
        {
            System.out.println("In math, dividing by 0 is undefined.");
        }

        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        }

        catch(FileNotFoundException e) {
            System.out.println("That file does not exist.");
        }
        catch(IOException | ParseException e) {
            System.out.println("Could not access/read data.");
        }
        finally {
            if(reader != null) {
                try {
                    reader.close();
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Bye!");
    }
}
