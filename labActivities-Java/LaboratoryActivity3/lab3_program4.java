import java.io.*;
import java.util.Scanner;

public class lab3_program4 {
    public static void main(String[] args) throws IOException {
        int numInput = 0, largestNum = 0, smallestNum = 0;
        boolean largestFirstInt = false, smallestFirstInt = false;
        String fileName = "numbers.txt"; // Apparently, arrays are fixed length, so that's why there is a separate file here for storing numbers
        File numFile = new File(fileName);
        Scanner kb = new Scanner(System.in);

        if (!numFile.exists()) {
            System.out.println("ERROR: FILE DOES NOT EXIST");
            System.exit(0);
        }

        else {
            Scanner fileChecker = new Scanner(numFile);
            PrintWriter reachFile = new PrintWriter(numFile);
            while (numInput != -99) {
                System.out.print("Enter a number to enter into the series: ");
                numInput = kb.nextInt();
                reachFile.println(numInput);
            }
            reachFile.close(); // Needed to actualize the data being 'PrintWriter-ed' to the file

            System.out.println("\nOUTPUT: ");

            // For calculation after input
            while (fileChecker.hasNext()) {
                int output = fileChecker.nextInt();
                
                if (largestFirstInt == false) { // Initialize first number from the series
                    largestFirstInt = true;
                    largestNum = output;
                }
                else {
                    if (largestNum < output) { // Checks to see if the current stored value is LESSER than the current number from the series
                        largestNum = output;
                    }
                }

                if (smallestFirstInt == false) { // Initialize first number from the series
                    smallestFirstInt = true;
                    smallestNum = output;
                }
                else {
                    if (smallestNum > output && output != -99) { // Checks to see if the current stored value is GREATER than the current number from the series
                        smallestNum = output; // Will not include -99 because it is a terminating value
                    }
                }
            }
                System.out.println("LARGEST NUMBER IS: " + largestNum);
                System.out.println("SMALLEST NUMBER IS: " + smallestNum);
        }
    }
}
