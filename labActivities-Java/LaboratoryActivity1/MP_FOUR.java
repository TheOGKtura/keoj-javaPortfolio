import java.util.Scanner;

public class MP_FOUR {
    public static void main(String[] args) {
        float testOne;
        float testTwo;
        float testThree;
        float testCount = 0;
        float avgTests;

        Scanner input = new Scanner(System.in);

        System.out.print("Test #1 score: ");
        testOne = input.nextFloat();
        testCount++;

        System.out.print("Test #2 score: ");
        testTwo = input.nextFloat();
        testCount++;

        System.out.print("Test #3 score: ");
        testThree = input.nextFloat();
        testCount++;

        avgTests = (testOne + testTwo + testThree) / testCount;

        System.out.printf("\nScore of test #1: %.2f\n", testOne);
        System.out.printf("Score of test #2: %.2f\n", testTwo);
        System.out.printf("Score of test #3: %.2f\n", testThree);
        System.out.printf("Average of all tests: %.2f", avgTests);
    }
}
