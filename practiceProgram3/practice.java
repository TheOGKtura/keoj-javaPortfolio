import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class practice {
    double gravity = 9.81;
    public static void main(String[] args) {
        practice prac = new practice(); // Declare and initialize main(?)
        // UNIVERSAL
        double stepsize;
        double time;
        double mass; // 68.1
        double coefficient; // 12.5
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input step size (in seconds): ");
        stepsize = input.nextDouble();
        //System.out.printf("VALUE: %f", stepsize);
        System.out.print("Input time (in seconds): ");
        time = input.nextDouble();
        System.out.print("Enter the mass (assuming in kg): ");
        mass = input.nextDouble();
        System.out.print("Enter the coefficient: ");
        coefficient = input.nextDouble();

        // ANALYTICAL OR EXACT EQUATION
        double analyticalValue = prac.analyticalCalculator(time, mass, coefficient); // Call upon main before other function(?)
        //System.err.printf("LAST STEP VALUE: %.2f\n", analyticalValue);

        double exactValue = prac.exactCalculator(time, stepsize, mass, coefficient); // Call upon main before other function(?)
        //System.err.printf("LAST STEP VALUE: %.2f\n", exactValue);

        BigDecimal ARE_VALUE = prac.ARE_Calculator(analyticalValue, exactValue);
        System.out.printf("\nRESULT: %.4f%%\n", ARE_VALUE);
    }

    double analyticalCalculator(double time, double mass, double coefficient) {
        double physics;
        double exponent;

        // FOR ANALYTICAL OR EXACT EQUATION
        double eCalc;
        double exactTotal = 0; // Need to initialize "= 0" before returning. Does not work with declaring only.

        System.out.println("\nANALYTICAL OR EXACT EQUATION: ");
        for (int i = 0; i <= time; i++){
            physics = (gravity * mass) / coefficient;
            exponent = -(coefficient/mass) * i;
            eCalc = 1 - (Math.pow(Math.E, exponent));
            exactTotal = physics * eCalc;
            System.out.println("STEP: " + i);
            System.out.printf("RESULT: %.2f\n", exactTotal);
            System.out.println("=================");

            if (i == time){
                return exactTotal;
            }
        }
        return exactTotal;
    }

    double exactCalculator(double time, double stepsize, double mass, double coefficient) {
        // FOR NUMERICAL OR APPROXIMATE EQUATION
        double calc;
        double ctr = 0;
        double currentVal = 0;
        double approximateTotal = 0; // Need to initialize "= 0" before returning. Does not work with declaring only.
        
        
        if (stepsize == 0.5) {
            time = time + time;
        }

        System.out.println("\nNUMERICAL OR APPROXIMATE EQUATION: ");
        // NUMERICAL OR APPROXIMATE EQUATION
        for (int i = 0; i <= time; i++){
            if (stepsize == 0.5) { // IDK WHAT TO DO WITH NON-WHOLE SECONDS
                
                if (i == 0) {
                    System.out.println("STEP: " + i);
                    System.out.println("RESULT: 0");
                    currentVal = 0;
                    System.out.println("=================");
                }

                else if (i > 0) {
                    ctr = ctr + stepsize;
                    calc = gravity - ((coefficient/mass) * currentVal);
                    approximateTotal = currentVal + (calc * stepsize); 
                    System.out.println("STEP: " + ctr);
                    System.out.printf("RESULT: %.2f\n", approximateTotal);
                    currentVal = approximateTotal;
                    System.out.println("=================");
                }

                if (i == time) {
                    return approximateTotal;
                }
            }
            
            else if (stepsize == 2){
                if (i == 0) {
                    System.out.println("STEP: " + i);
                    System.out.println("RESULT: 0");
                    currentVal = 0;
                    System.out.println("=================");
                }

                else if (i > 0 && i <= 4) {
                    calc = gravity - ((coefficient/mass) * currentVal);
                    approximateTotal = currentVal + (calc * stepsize); 
                    System.out.println("STEP: " + i + " + " + i);
                    System.out.printf("RESULT: %.2f\n", approximateTotal);
                    currentVal = approximateTotal;
                    System.out.println("=================");
                }


                if (i > 4) {
                    return approximateTotal;
                }
            }

            else{
                if (i == 0) {
                    System.out.println("STEP: " + i);
                    System.out.println("RESULT: 0");
                    currentVal = 0;
                    System.out.println("=================");
                }

                else if (i > 0) {
                    calc = gravity - ((coefficient/mass) * currentVal);
                    approximateTotal = currentVal + (calc * stepsize); 
                    System.out.println("STEP: " + i);
                    System.out.printf("RESULT: %.2f\n", approximateTotal);
                    currentVal = approximateTotal;
                    System.out.println("=================");
                }

                if (i == time) {
                    return approximateTotal;
                }
            }
        }
        return approximateTotal;
    }

    BigDecimal ARE_Calculator(double analytical, double numerical) {
        // DECLARATION AND INITIALIZATION OF BIG DECIMALS
        BigDecimal ARETotal = new BigDecimal(0);
        BigDecimal percentage = new BigDecimal(100);
        BigDecimal analyticalValue = BigDecimal.valueOf(analytical); // Using "valueOf" to essentially convert the double value into a BigDecimal
        BigDecimal numericalValue = BigDecimal.valueOf(numerical);
        
        // ROUNDING OFF OF INHERENT VALUES
        // Needs to BigDecimal for exact/precise values
        analyticalValue = analyticalValue.setScale(2, RoundingMode.HALF_UP);
        numericalValue = numericalValue.setScale(2, RoundingMode.HALF_UP);
        
        // CALCULATION FOR ABSOLUTE RELATIVE ERROR (unsure if this follows parentheses rule, separate lines of operation if not)
        System.out.println("\nABSOLUTE RELATIVE ERROR: ");
        System.out.println("|" + analyticalValue + " - " + numericalValue + "|" + "\n---------------- x 100%"+ "\n    |" + analyticalValue + "|");
        ARETotal = analyticalValue.subtract(numericalValue).divide(analyticalValue, 6, RoundingMode.HALF_UP).multiply(percentage).abs(); 
        // Added ".abs()" for absolute value/conversion to positive

        return ARETotal;
    }
}
