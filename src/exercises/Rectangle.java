package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner in;
        double width, length, area;

        in = new Scanner(System.in);

        System.out.println("Enter the width of your rectangle: ");
        width = in.nextDouble();
        System.out.println("Enter the length of your rectangle: ");
        length = in.nextDouble();

        area = (length * width);

        System.out.println("The area of your rectangle is: " + area + " square units");
    }
}
