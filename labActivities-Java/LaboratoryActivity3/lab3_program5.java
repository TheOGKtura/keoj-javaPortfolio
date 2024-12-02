import java.util.Scanner;
import java.io.*;

public class lab3_program5 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        Scanner kb = new Scanner(System.in);

        System.out.println("FILE READER");
        System.out.print("Enter the name of a file: ");
        String fileName = kb.nextLine();
        File checkFile = new File(fileName);
        
        while (!checkFile.exists()) {
            System.out.println("ERROR: FILE DOES NOT EXIST/INVALID FILE");
            System.out.print("Enter the name of a file: ");
            fileName = kb.nextLine();
            checkFile = new File(fileName);
        }
        
        Scanner readFile = new Scanner(checkFile);

        while (readFile.hasNext()) {
            count++;
            String line = readFile.nextLine(); // Because this is an input command (2)
            String nextLine = line.toString(); // Needed for output (1)
            System.out.println(count + ": " + nextLine);
        }

        System.out.println("Successfully read file '" + fileName + "'");
    }
}
