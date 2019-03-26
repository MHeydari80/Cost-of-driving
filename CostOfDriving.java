package costofdriving;

import java.util.Scanner;

public class CostOfDriving {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance(miles):\t");
        float distance = input.nextFloat();

        System.out.print("\nEnter miles per gallon: \t\t");
        float fuel = input.nextFloat();

        System.out.print("\nEnter price per gallon: \t\t");
        float price = input.nextFloat();

        double drivingCost = distance / fuel * price;

        System.out.printf("\n\nThe cost of driving is  \t\t$%.3f\n\n", drivingCost);
    }

}
