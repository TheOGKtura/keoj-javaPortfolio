import java.util.Scanner;

public class lab4_program4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean quitProgram = false;
        int userChoose = 0;
        double meters = 0;

        System.out.println("\nMETER CONVERSION PROGRAM");
        while (meters <= 0) {
            System.out.print("Enter the amount of meters to convert: ");
            meters = in.nextDouble();

            if (meters <= 0) {
                System.out.println("ERROR: INVALID NUMBER\n");
            }
        }

        while (quitProgram == false) {
            menu();
            System.out.print("Enter number: ");
            userChoose = in.nextInt();

            if (userChoose <= 0 || userChoose > 4) {
                System.out.println("ERROR: INVALID OPTION\n");
            }

            else if (userChoose == 1) {
                showKilometers(meters);
            }

            else if (userChoose == 2) {
                showInches(meters);
            }

            else if (userChoose == 3) {
                showFeet(meters);
            }

            else if (userChoose == 4) {
                quitProgram = true;
                System.out.println("Thank you for using our program! Goodbye :)");
                //System.exit(0);
            }
        }
    }

    public static void menu() {
        System.out.println("\nMENU");
        System.out.println("1. Convert to kilometers\n2. Convert to inches\n3. Convert to feet\n4. Quit the program");
    }

    public static void showKilometers(double meters) {
        double kilometers = 0;

        kilometers = meters * 0.001;
        System.out.printf("RESULT: %.2f km\n", kilometers);
    }

    public static void showInches(double meters) {
        double inches = 0;

        inches = meters * 39.37;
        System.out.printf("RESULT: %.2f in\n", inches);
    }

    public static void showFeet(double meters) {
        double feet = 0;

        feet = meters * 3.281;
        System.out.printf("RESULT: %.3f ft\n", feet);
    }
}
