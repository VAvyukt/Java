package Homework;

public class EscapeCharacters {
    public static void main(String args[]) {
        //Single/Double Quotes
        String name = "Hello \"Vivaan\"!";
        System.out.println(name);
        System.out.println();

        //Backslash
        String windowsDir = "c:\\Windows\\...";
        System.out.println(windowsDir);
        System.out.println();

        //Tab
        String price = "5 apples\t$5";
        System.out.println(price);
        System.out.println();

        //New line
        String greeting = "Good morning!\nHow are you doing today??";
        System.out.println(greeting);
    }
}
