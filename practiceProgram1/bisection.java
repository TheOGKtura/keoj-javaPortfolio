import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class bisection {
    public static void main(String[] args) {
        bisection callCalc = new bisection();
        double x = 0;
        double a = -0.5;
        double b = 2.5;
        double c = 4.5;
        double result;
        double savedResult = 0;
        boolean sign = false; // Needed to initialize first
        boolean imposCheck = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x value: ");
        x = input.nextDouble();

        result = a * (Math.pow(x, 2)) + b * (x) + c;

        System.out.print(a + "(" + x + ")" + "^2" + " + " + b + "(" + x + ")"+ " + " + c + " = ");
        System.out.printf("%.3f\n", result);
    }
}
    /*BigDecimal bisectionsignChecker(boolean savedSign) {
        for (int i = 0; i <= 1; i++) {
            result = a * (Math.pow(i, 2)) + b * (i) + c;

            System.out.print(a + "(" + i + ")" + "^2" + " + " + b + "(" + i + ")"+ " + " + c + " = ");
            System.out.printf("%.3f\n", result);
            if (i == 0){
                savedResult = result;
            }

            if (i == 1) {
                if (result < 0) {
                    sign = false; // false = negative
                }

                else if (result > 0) {
                    sign = true; // ; true = positive
                }
                x = 0;
            }
            // Should be that if the value of result at index 1 is greater than the value or result at index 0
            // then it should decrement down until it hits negative; and vice versa if it is lesser.
        }

        System.out.println(sign);

        if (sign == false) {
            // Should go towards positive
            do {
                if (x == 5) {
                    break;
                }
                else {
                    savedResult = a * (Math.pow(x, 2)) + b * (x) + c;
                    System.out.print(x);
                    System.out.printf(" = %.3f\n", savedResult);
                }
                x++;
            } while(savedResult < 0);
        }

        else if (sign == true) {
            double imposResult;
            int check = 0;
            boolean change = false;
            // Should go towards negative
            do {
                if (x == -5) {
                    break;
                }
                else {
                    savedResult = a * (Math.pow(x, 2)) + b * (x) + c;
                    System.out.print(x);
                    System.out.printf(" = %.3f\n", savedResult);
                    imposResult = savedResult;
                    if (imposResult >= savedResult) {
                        check++;
                        if (check >= 1) {
                            change = true;
                        }
                    }
                }
                x--;
            } while(savedResult > 0);
        }

    }
    */

//}