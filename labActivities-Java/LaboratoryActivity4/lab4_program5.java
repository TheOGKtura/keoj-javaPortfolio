import java.util.Scanner;

public class lab4_program5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int roomCount = 0;
        double sqftWallSpace[] = {}, paintCostNow = 0;; // Need arrays to initialize
        
        System.out.println("\nPAINT JOB COST CALCULATION PROGRAM");
        while (paintCostNow <= 0) {
            System.out.print("Enter the cost of paint: ");
            paintCostNow = in.nextDouble();

            if (paintCostNow <= 0) {
                System.out.println("ERROR: INVALID NUMBER\n");
            }
        }

        while (roomCount <= 0) {
            System.out.print("Enter the number of rooms needing to be painted: ");
            roomCount = in.nextInt();

            if (roomCount <= 0) {
                System.out.println("ERROR: INVALID NUMBER\n");
            }
        }
        
        sqftWallSpace = new double[roomCount]; // Set length of array
        System.out.println();

        //System.out.println(sqftWallSpace.length);

        // Initialization of square feet per room.
        for (int i = 0; i < sqftWallSpace.length; i++) {
            int count = i + 1;
            while (sqftWallSpace[i] <= 0) {
                System.out.print("Enter the square feet for room " + count +": ");
                sqftWallSpace[i] = in.nextDouble();

                if (sqftWallSpace[i] <= 0) {
                    System.out.println("ERROR: INVALID NUMBER\n");
                }
            }
        }

        System.out.println("\nPER ROOM CALCULATIONS: ");
        for (int j = 0; j < sqftWallSpace.length; j++) {
            double noGallons = noGallons(sqftWallSpace[j]), 
            laborHours = laborHours(sqftWallSpace[j]), 
            paintCost = paintCost(noGallons(sqftWallSpace[j]), paintCostNow),
            laborCharges = laborCharges(laborHours),
            totalCost = totalCost(paintCost, laborCharges);

            int count = j + 1;
            System.out.println("ROOM " + count  + ": ");
            System.out.printf("Number of gallons of paint required: %.1f\n", noGallons);
            System.out.printf("Hours of labor required: %.2f\n", laborHours);
            System.out.printf("The cost of the required: %.2f\n", paintCost);
            System.out.printf("The labor charges: %.2f\n", laborCharges);
            System.out.printf("TOTAL COST OF PAINT JOB: %.2f\n", totalCost);
            System.out.println();
        }
    }

    public static double noGallons(double sqft) {
        double requiredGoP = 0;

        requiredGoP = sqft / 118;

        return requiredGoP;
    }

    public static double laborHours(double sqft) {
        double laborHours = 0;

        laborHours = (sqft / 118) * 8;
        
        return laborHours;
    }

    public static double paintCost(double gallons, double cost) {
        double paintCostTotal = 0;

        paintCostTotal = gallons * cost;
        return paintCostTotal;
    }

    public static double laborCharges(double hours) {
        double hoursCost = 0;

        hoursCost = hours * 150.00;

        return hoursCost;
    }

    public static double totalCost(double PCT, double HC) {
        double total = 0;

        total = PCT + HC;

        return total;
    }
}
