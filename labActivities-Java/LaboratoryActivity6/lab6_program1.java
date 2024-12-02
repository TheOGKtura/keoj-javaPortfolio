import java.util.Scanner;

public class lab6_program1 {
    public static void main(String[] args) {
        /* Issue earlier:
        It would automatically end the program when I put the array object into the declared section. 
        The reason for it is because the array that would initially fill it up was empty. */

        String[] months = { "January", "February", "March",
                            "April", "May", "June", "July",
                            "August", "September", "October",
                            "November", "December" };
        double[] rainFall = new double[12];
        double rf = -1, total = 0; // Set rf as -1 as to ensure the loop does not accept negative numbers.
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            while (rf < 0) {
                System.out.print("For " + months[i] + ", the amount of rainfall is: ");
                rf = in.nextDouble();
    
                if (rf < 0){
                    System.out.println("ERROR: INVALID NUMBER. ENTER ANOTHER NUMBER THAT IS NON-NEGATIVE\n");
                }
    
                else {
                    rainFall[i] = rf;
                }
                // System.out.println(rainFall[i]); // For testing
            }
            rf = -1; // Reset back after the fact
        }

        // OUTPUT: 
        RainLevel Year = new RainLevel(rainFall); // Set array object once the initial array has been filled
        System.out.println("TOTAL: " + Year.getTotalRainfall());
        System.out.println("AVERAGE: "+ Year.getAverageRainfall());
        System.out.println(Year.getMostRainfallMonth());
        System.out.println(Year.getLeastRainfallMonth());
    }
}