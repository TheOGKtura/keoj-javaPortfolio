import java.util.Scanner;

public class MP_FIVE {
    public static void main(String[] args) {
        double totalProfit;
        double retailPrice;
        double percentProfit = (40/100.02f);

        Scanner input = new Scanner(System.in);

        System.out.print("Retail price of the item: ");
        retailPrice = input.nextDouble();

        totalProfit = retailPrice * percentProfit;

        System.out.println("\nWith profit at 40%");
        System.out.printf("Total profit for this item: %.2f\n", totalProfit);
    }
}
