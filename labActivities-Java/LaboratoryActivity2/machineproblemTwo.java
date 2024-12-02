import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class machineproblemTwo {
    public static void main(String[] args) {
        // Usage of imperial system for weight and height
        // Meaning weight in pounds, and height in inches
        BigDecimal weight = new BigDecimal(0);
        BigDecimal height = new BigDecimal(0);
        BigDecimal constant = new BigDecimal(703);
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight (in pounds): ");
        weight = input.nextBigDecimal();
        double weightCompare = weight.doubleValue();
        if (weightCompare < 0) {
            System.out.println("ERROR: INVALID NUMBER");
            return;
        }

        System.out.print("Enter your height (in inches): ");
        height = input.nextBigDecimal();
        height = height.pow(2);
        double heightCompare = height.doubleValue();
        if (heightCompare < 0) {
            System.out.println("ERROR: INVALID NUMBER");
            return;
        }

        BigDecimal BMI = constant.multiply(weight.divide(height, 4, RoundingMode.HALF_UP));
        BMI = BMI.setScale(1, RoundingMode.HALF_UP); // Round off result
        double BMIconversion = BMI.doubleValue(); // Convert to double because big decimal is unusable(?) for conditional statements
        System.out.println("\nRESULTS: ");

        if (BMIconversion > 25) {
            System.out.println("BMI = " + BMI);
            System.out.println("You are overweight.");
        }

        else if (BMIconversion < 18.5) {

            System.out.println("BMI = " + BMI);
            System.out.println("You are underweight.");
        }
        
        else if (BMIconversion >= 18.5 && BMIconversion <= 25) {
            System.out.println("BMI = " + BMI);
            System.out.println("You are at the optimal weight. Be happy :)");
        }
    }
}
