import java.util.Scanner;

public class MP_TWO {
    public static void main(String[] args) {
        double purchAmount;
        double stateTax = (4/100.02f);
        double countryTax = (2/100.02f);
        double totalTax;
        double totalSales;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount from purchased: ");
        purchAmount = input.nextDouble(); // Specify the type of variable after the "next" and call upon the input for use of input.

        // Tax calculations
        stateTax = stateTax * purchAmount; // To use the percentage of something, first divide the given number by a 100 and then multiply it to the context needed.
        countryTax = countryTax * purchAmount; // Need to specify the divisor with "f" to simulate float
        // Total calculations
        totalTax = stateTax + countryTax;
        totalSales = purchAmount + stateTax + countryTax;

        System.out.println("Amount: " + purchAmount);
        
        // For the following amounts, they should be printed using this format of printing
        // Whilst also keeping in mind on how to format the in specified decimal plcaes via the "%.2f", which from my speculation, can be another decimal place rather than 2.
        System.out.printf("State Sales Tax: %.2f\n", stateTax);
        System.out.printf("Country Sales Tax: %.2f\n", countryTax);
        System.out.printf("Total Tax: %.2f\n", totalTax);
        System.out.printf("Total Sales: %.2f\n", totalSales);
    }
}
