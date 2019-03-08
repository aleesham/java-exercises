package org.launchcode.java.studios;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double PI = 3.14;
        Double radius, area;
        // Prompt the user for a radius
        System.out.println("Enter a radius: ");
        radius = in.nextDouble();
        // Compute the area of the circle
        area = PI * radius * radius;

        // Print the area nicely
        System.out.println("The area of a circle of radius " + radius + " is " + area);
    }
}
