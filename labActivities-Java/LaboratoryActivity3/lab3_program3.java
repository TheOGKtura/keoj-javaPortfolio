import java.util.Scanner;

public class lab3_program3 {
    public static void main(String[] args) {
        int days, presentDays = 0;
        double penny = 1;
        boolean firstPay = false;
        double dollar;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of days worked: ");
        days = kb.nextInt();

        while (days <= 0) {
            System.out.println("ERROR: INVALID NUMBER OF DAYS INPUTTED.");
            System.out.print("Enter the number of days worked: ");
            days = kb.nextInt();
        }

        System.out.println("\n\tDAYS WORKED \t   TOTAL EARNED");
        System.out.println("==================================================");

        while (days > 0) {
            if (firstPay == false) {
                presentDays++;
                firstPay = true;
                dollar = penny / 100;
                // System.out.println("$" + dollar + "\t\t" + presentDays);
                System.out.println("\t     " + presentDays + "\t\t      " + "$" + dollar);
                days--;
            }

            else {
                presentDays++;
                penny = penny + penny;
                dollar = penny / 100;
                System.out.print("\t     " + presentDays + "\t\t      ");
                System.out.print("$");
                System.out.printf("%.2f\n", dollar);
                
                days--;
            }
            
        }

    }
}
