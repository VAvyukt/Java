package Homework;

import java.awt.*;

public class MemoryAllocation {
    public static void main(String args[]) {
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println("Primitive DType Ex: " + y);
        
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println("Reference DType Ex: " + point2);
        System.out.println("Reference stores memory addr and hence the point2 x value is updated");
        
    }
}
