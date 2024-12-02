import java.util.Scanner;
import java.io.*;

public class lab3_program2 {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        System.out.println("FILE UPPERCASE CONVERSION SYSTEM (Please enter full name of file along with extension)");
        System.out.print("Enter the name of the first file to convert: ");
        String firstFileName = kb.nextLine(); // Can both initialize and declare string during this sequence.
        System.out.print("Enter the name of the file to save the conversions: ");
        String secondFileName = kb.nextLine();

        // Declare and initialize files from inputted strings, needs the extension bit as well, not just the name.
        File firstFile = new File(firstFileName);
        File secondFile = new File(secondFileName);

        if (firstFile.exists() && secondFile.exists()) {
            Scanner inputFile = new Scanner(firstFile);
            PrintWriter outputFile = new PrintWriter(secondFile);
            while (inputFile.hasNext()) { // Checks for each line of the file inputted.
                String convertingLine = inputFile.nextLine();
                String conversion = convertingLine.toUpperCase();
                outputFile.println(conversion);
            }
            outputFile.close();
            System.out.println("\nSuccessfully converted file '" + firstFileName + "' to file '" + secondFileName + "'");
        }

        else {
            System.out.println("File/s do not exist.");
            System.exit(0); // What's the difference of this to return within the main function?
        }
        
    }
}