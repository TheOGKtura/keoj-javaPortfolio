import java.util.Scanner;

public class lab5_program3 {
    public static void main(String[] args) {
        int testCount = 0;
        Scanner in = new Scanner(System.in);

        while (testCount <= 0) {
            System.out.print("Enter number of tests to score: ");
            testCount = in.nextInt();
            
            if (testCount <= 0) {
                System.out.println("ERROR: INVALID NUMBER\n");
            }
        }

        // Sets the array range for tests
        TestScores Batch = new TestScores(testCount);

        for (int i = 0; i < testCount; i++) {
            int count = i + 1, testScore = 0;

            while (testScore <= 0) {
                System.out.print("Enter score for test #" + count + ": ");
                testScore = in.nextInt();
                Batch.setScore(i, testScore);

                if (testScore < 0) {
                    System.out.println("ERROR: INVALID NUMBER\n");
                }
            }

        }

        System.out.printf("The average of the " + testCount + " tests is: " + "%.2f\n", Batch.Average());
        // System.out.println(Batch.getScore(2));
    }
}
