import java.util.Scanner;

public class MP_TEN {
    public static void main(String[] args) {
        double stocksBought;
        double stocksSold;
        double stockBuyAmount;
        double stockSellAmount;
        double commissionBought;
        double commissionSold;
        double profit;

        double stockBuy = 32.87;
        double stockSell = 33.92;
        double stockbrokerCommission = (2/100.02f);

        Scanner input = new Scanner(System.in);
        System.out.print("Amount of stocks bought: ");
        stocksBought = input.nextDouble();
        System.out.print("Amount of stocks sold: ");
        stocksSold = input.nextDouble();

        // BUYING SHARES
        stockBuyAmount = stocksBought * stockBuy; // Multiply amount of shares bought to price
        commissionBought = stockbrokerCommission * stockBuyAmount; // Commission fee for bought shares
        // SELLING SHARES
        stockSellAmount = stocksSold * stockSell; // Multiply amount of shares sold to price
        commissionSold = stockbrokerCommission * stockSellAmount; // Commission fee for sold shares

        profit = stockSellAmount - (stockBuyAmount + commissionBought + commissionSold);

        System.out.println("\nRESULTS: ");
        System.out.printf("Amount paid for shares: %.2f\n", stockBuyAmount);
        System.out.printf("Stockbroker BUY commission: %.2f\n", commissionBought);
        System.out.printf("Amount from sold shares: %.2f\n", stockSellAmount);
        System.out.printf("Stockbroker SELL commission: %.2f\n", commissionSold);
        System.out.printf("Total Profit: %.2f\n", profit);
    }
}
