package Homework;

public class Strings {
    public static void main(String args[]) {
        String message = "   Hello" + "!!    ";
        System.out.println(message);
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.startsWith("Hello"));
        System.out.println(message.trim());
        System.out.println(message.replace('!', '*'));
        System.out.println(message);
    }
}
