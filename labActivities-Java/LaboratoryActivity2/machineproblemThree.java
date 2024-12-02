import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class machineproblemThree {
    public static void main(String[] args) {
        double tests[] = new double[3]; // Initialize the array, inside square bracket is length. (Still unsure how to do so without it)
        double totalScore = 0;
        BigDecimal roundedAvg = new BigDecimal(0);

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < tests.length; i++) {
            int count = i + 1;
            System.out.print("Enter score for test #" + count + ": ");
            tests[i] = input.nextDouble(); // Put to index with '[i]', because calling upon the variable itself calls the array.
            if (tests[i] < 0) {
                System.out.println("ERROR: INVALID NUMBER");
                return;
            }
            totalScore = totalScore + tests[i];

            if (i == 2) {
                totalScore = totalScore/tests.length;
                roundedAvg = roundedAvg.valueOf(totalScore).setScale(0, RoundingMode.HALF_UP);
                totalScore = roundedAvg.doubleValue();
                // System.out.println(totalScore);
                
                if (totalScore > 100 || totalScore < 0) {
                    System.out.println("ERROR: INVALID TEST SCORE AVERAGE");
                }

                else if (totalScore >= 93 && totalScore <= 100) {
                    System.out.println();
                    System.out.println("The Test Score Average is: " + totalScore);
                    System.out.println("Letter Grade: A");
                }

                else if (totalScore >= 90 && totalScore <= 92) {
                    System.out.println();
                    System.out.println("The Test Score Average is: " + totalScore);
                    System.out.println("Letter Grade: A-");
                }

                else if (totalScore >= 87 && totalScore <= 89) {
                    System.out.println();
                    System.out.println("The Test Score Average is: " + totalScore);
                    System.out.println("Letter Grade: B+");
                }

                else if (totalScore >= 83 && totalScore <= 86) {
                    System.out.println();
                    System.out.println("The Test Score Average is: " + totalScore);
                    System.out.println("Letter Grade: B");
                }

                else if (totalScore >= 80 && totalScore <= 82) {
                    System.out.println();
                    System.out.println("The Test Score Average is: " + totalScore);
                    System.out.println("Letter Grade: B-");
                }

                else if (totalScore >= 77 && totalScore <= 79) {
                    System.out.println();
                    System.out.println("The Test Score Average is: " + totalScore);
                    System.out.println("Letter Grade: C+");
                }

                else if (totalScore >= 73 && totalScore <= 76) {
                    System.out.println();
                    System.out.println("The Test Score Average is: " + totalScore);
                    System.out.println("Letter Grade: C");
                }

                else if (totalScore >= 70 && totalScore <= 72) {
                    System.out.println();
                    System.out.println("The Test Score Average is: " + totalScore);
                    System.out.println("Letter Grade: C-");
                }

                else if (totalScore >= 67 && totalScore <= 69) {
                    System.out.println();
                    System.out.println("The Test Score Average is: " + totalScore);
                    System.out.println("Letter Grade: D+");
                }

                else if (totalScore >= 63 && totalScore <= 66) {
                    System.out.println();
                    System.out.println("The Test Score Average is: " + totalScore);
                    System.out.println("Letter Grade: D");
                }

                else if (totalScore >= 60 && totalScore <= 62) {
                    System.out.println();
                    System.out.println("The Test Score Average is: " + totalScore);
                    System.out.println("Letter Grade: D-");
                }

                else if (totalScore >= 0 && totalScore < 60) {
                    System.out.println();
                    System.out.println("The Test Score Average is: " + totalScore);
                    System.out.println("Letter Grade: F");
                }
            }
        }
    }
}
