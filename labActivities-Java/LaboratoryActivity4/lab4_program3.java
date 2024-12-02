import java.util.Scanner;

public class lab4_program3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noStocks = 0;
        double ppShare = 0, spShare = 0, purchCommissionPaid = 0, saleCommissionPaid = 0, profit = 0;

        System.out.println("SHARE PROFIT CALCULATOR");

        // Getting the amount of shares
        while (noStocks <= 0) {
            System.out.print("Enter number of shares to buy: ");
            noStocks = in.nextInt();

            if (noStocks <= 0) {
                System.out.println("ERROR: INAVLID NUMBER\n");
            }
        }

        // Buying Shares
        while (ppShare <= 0) {
            System.out.print("Enter the price per share bought: $");
            ppShare = in.nextDouble();

            if (ppShare <= 0) {
                System.out.println("ERROR: INAVLID NUMBER\n");
            }
        }

        while (purchCommissionPaid <= 0) {
            System.out.print("Enter the commission price for a purchase: $");
            purchCommissionPaid = in.nextDouble();

            if (purchCommissionPaid <= 0) {
                System.out.println("ERROR: INAVLID NUMBER\n");
            }
        }

        // Selling Shares
        while (spShare <= 0) {
            System.out.print("Enter the price per share sold: $");
            spShare = in.nextDouble();

            if (spShare <= 0) {
                System.out.println("ERROR: INAVLID NUMBER\n");
            }
        }

        while (saleCommissionPaid <= 0) {
            System.out.print("Enter the commission price for a sale: $");
            saleCommissionPaid = in.nextDouble();

            if (saleCommissionPaid <= 0) {
                System.out.println("ERROR: INAVLID NUMBER\n");
            }
        }

        profit = shareCalculation(noStocks, ppShare, purchCommissionPaid, spShare, saleCommissionPaid);

        System.out.printf("\nRESULTS:\nTOTAL PROFITS: $%.2f\n", profit);
        if (profit <= 0) {
            System.out.println("You lost money. Do better next time.");
        }

        else {
            System.out.println("You profitted! Congrats!");
        }
    }

    public static double shareCalculation(int NS, double PP, double PC, double SP, double SC) {
        double profit = 0;

        profit = ((NS * SP) - SC) - ((NS * PP) + PC);

        return profit;
    }
}
