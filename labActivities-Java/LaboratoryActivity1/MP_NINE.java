import java.util.Scanner;

public class MP_NINE {
    public static void main(String[] args) {
        double cookieAmount;
        double sugarAmount = 1.5;
        double butterAmount = 1;
        double flourAmount = 2.75;

        Scanner input = new Scanner(System.in);

        System.out.print("How many cookies should be made: ");
        cookieAmount = input.nextDouble();

        sugarAmount = (sugarAmount / 48) * cookieAmount;
        butterAmount = (butterAmount / 48) * cookieAmount;
        flourAmount = (flourAmount / 48) * cookieAmount;

        System.out.println("\nRESULTS: ");
        System.out.printf("Amount of cookies that needs to be made: %.0f\n", cookieAmount);
        System.out.printf("Required amount of sugar: %.2f cups\n", sugarAmount);
        System.out.printf("Required amount of butter: %.2f cups\n", butterAmount);
        System.out.printf("Required amount of flour: %.2f cups\n", flourAmount);
    }
}
