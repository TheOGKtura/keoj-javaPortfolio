import java.util.Scanner;

public class machineproblemFive {
    public static void main(String[] args) {
        double packageWeight;
        double shippingDistance;
        double saveSD;
        double price;
        double distanceCount = 0; // No distance has been traveled yet so put to 0
        double nmtOne = 139.99;
        double nmtThree = 359.99;
        double nmtFive = 579.99;
        double nmtTen = 799.99;
        double nmtTwenty = 1319.99;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package (in kilograms): ");
        packageWeight = input.nextDouble();

        if (packageWeight <= 0 || packageWeight > 20) { // Error message
            System.out.println("ERROR: INVALID NUMBER");
            return;
        }

        System.out.print("Enter the distance of travel for the package to be shipped (in meters): ");
        saveSD = input.nextDouble();

        if (saveSD < 0) {
            System.out.println("ERROR: INVALID NMBER");
            return;
        }

        shippingDistance = saveSD;

        for (int i = -1; i < distanceCount; i++) {
            if (saveSD > 0) { // If no more to subtract from the distance value, then move to next operation
                saveSD = saveSD - 500; // Subtract 500 from the inputted distance per iteration
                distanceCount++; // You can iterate on the iteration limit of the for loop, and this does exactly that
                //System.out.println(i);
                //System.out.println(distanceCount);
            }
        }

        System.out.println("\nRESULTS: ");
        if (packageWeight > 0 && packageWeight <= 1) {
            price = distanceCount * nmtOne;
            System.out.println("Shipping charge per 500 meters is: " + nmtOne);
            System.out.println("Weight(in kilograms): " + packageWeight);
            System.out.println("Distance of shipping(in meters): " + shippingDistance);
            System.out.printf("The price for the shipping is: %.2f", price);
        }

        else if (packageWeight > 1 && packageWeight <= 3) {
            price = distanceCount * nmtThree;
            System.out.println("Shipping charge per 500 meters is: " + nmtThree);
            System.out.println("Weight(in kilograms): " + packageWeight);
            System.out.println("Distance of shipping(in meters): " + shippingDistance);
            System.out.printf("The price for the shipping is: %.2f", price);
        }

        else if (packageWeight > 3 && packageWeight <= 5) {
            price = distanceCount * nmtFive;
            System.out.println("Shipping charge per 500 meters is: " + nmtFive);
            System.out.println("Weight(in kilograms): " + packageWeight);
            System.out.println("Distance of shipping(in meters): " + shippingDistance);
            System.out.printf("The price for the shipping is: %.2f", price);
        }

        else if (packageWeight > 5 && packageWeight <= 10) {
            price = distanceCount * nmtTen;
            System.out.println("Shipping charge per 500 meters is: " + nmtTen);
            System.out.println("Weight(in kilograms): " + packageWeight);
            System.out.println("Distance of shipping(in meters): " + shippingDistance);
            System.out.printf("The price for the shipping is: %.2f", price);
        }

        else if (packageWeight > 10 && packageWeight <= 20) {
            price = distanceCount * nmtTwenty;
            System.out.println("Shipping charge per 500 meters is: " + nmtTwenty);
            System.out.println("Weight(in kilograms): " + packageWeight);
            System.out.println("Distance of shipping(in meters): " + shippingDistance);
            System.out.printf("The price for the shipping is: %.2f", price);
        }
    }
}
