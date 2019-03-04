package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner in;
        double milesDriven;
        double gasConsumed; // In gallons
        double milesPerGallon;

        in = new Scanner(System.in);

        System.out.println("Enter the number of miles you've driven: ");
        milesDriven = in.nextDouble();

        System.out.println("Enter the amount of gas you've consumed (in gallons): ");
        gasConsumed = in.nextDouble();

        milesPerGallon = milesDriven/gasConsumed;

        System.out.println("Your vehicle gets " + milesPerGallon + " miles per gallon.");
    }
}
