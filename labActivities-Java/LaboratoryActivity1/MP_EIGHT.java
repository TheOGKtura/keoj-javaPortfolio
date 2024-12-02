import java.util.Scanner;

public class MP_EIGHT {
    public static void main(String[] args) {
        double priceperShare = 21.77;
        double stockbrokerCommission = (2/100.02f);
        double amountPaid;
        double commissionAmount;
        double total;
        double boughtShares;

        Scanner input = new Scanner(System.in);
        System.out.print("Input number of shares bought: ");
        boughtShares = input.nextDouble();
        
        amountPaid = boughtShares * priceperShare;
        commissionAmount = stockbrokerCommission * amountPaid;

        total = amountPaid + commissionAmount;

        System.out.println("\nRESULTS: ");
        System.out.printf("Shares fee: %.2f\n",amountPaid);
        System.out.printf("Stockbroker commission fee: %.2f\n", commissionAmount);
        System.out.printf("Total amount: %.2f", total);
    }
}
