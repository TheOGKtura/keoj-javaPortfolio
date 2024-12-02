import java.util.Scanner;

public class MP_SIX {
    public static void main(String[] args) {
        double mealCharge;
        double mealTax;
        double billAmount;
        double tableTip;
        double taxAfter;
        double requiredTax = (6.75/100.02f);
        double tipThreshold = (5/100.02f);

        Scanner input = new Scanner(System.in);
        System.out.print("Meal charge for bill: ");
        mealCharge = input.nextDouble();

        mealTax = requiredTax * mealCharge;
        taxAfter = mealTax + mealCharge; // Charge for bill after tax has been
        tableTip = tipThreshold * taxAfter;
        billAmount = mealTax + tableTip + mealCharge;

        System.out.println("\nRESULTS: ");
        System.out.printf("Meal charge: %.2f\n", mealCharge);
        System.out.printf("VATable Tax (Tax amount): %.2f\n", mealTax);
        System.out.printf("Service Charge (Tip amount): %.2f\n", tableTip);
        System.out.printf("Total amount: %.2f\n", billAmount);
    }
}