import java.util.Scanner;

public class machineproblemFour {
    public static void main(String[] args) {
        int packagesPurchased = 0;
        double packageRetail = 888;
        double price;
        double discount;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount of packages purchased: ");
        packagesPurchased = input.nextInt();
        System.out.println("\nRESULTS: ");
        double conversion = packagesPurchased;

        price = conversion * packageRetail;

        if (packagesPurchased < 0) {
            System.out.println("ERROR: INVALID AMOUNT");
            return;
        }
        
        else if (packagesPurchased > 0 && packagesPurchased < 10) { // 20% off range
            System.out.println("Packages purchased: " + packagesPurchased);
            System.out.printf("Total price: %.2f", price);
            System.out.println("\nNot eligible for discount.");
        }

        else if (packagesPurchased >= 10 && packagesPurchased <= 19) { // 20% off range
            System.out.println("Packages purchased: " + packagesPurchased);
            System.out.printf("Total price: %.2f", price);
            System.out.println("\nEligible for 20% discount.");
            discount = (price / 100) * 20;
            price = price - discount;
            System.out.printf("Total price after discount: %.2f", price);
        }
        
        else if (packagesPurchased >= 20 && packagesPurchased <= 49) { // 30% off range
            System.out.println("Packages purchased: " + packagesPurchased);
            System.out.printf("Total price: %.2f", price);
            System.out.println("\nEligible for 30% discount.");
            discount = (price / 100) * 30;
            price = price - discount;
            System.out.printf("Total price after discount: %.2f", price);
        }

        else if (packagesPurchased >= 50 && packagesPurchased <= 99) { // 40% off range
            System.out.println("Packages purchased: " + packagesPurchased);
            System.out.printf("Total price: %.2f", price);
            System.out.println("\nEligible for 40% discount.");
            discount = (price / 100) * 40;
            price = price - discount;
            System.out.printf("Total price after discount: %.2f", price);
        }

        else if (packagesPurchased >= 100) { // 50% off range
            System.out.println("Packages purchased: " + packagesPurchased);
            System.out.printf("Total price: %.2f", price);
            System.out.println("\nEligible for 50% discount.");
            discount = (price / 100) * 50;
            price = price - discount;
            System.out.printf("Total price after discount: %.2f", price);
        }
    }
}
