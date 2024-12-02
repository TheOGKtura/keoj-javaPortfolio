import java.util.Scanner;
import java.util.Random;

public class lab3_program1 {
    public static void main(String[] args) {
        double totalMoney = 0, enteredMoney = 0, winnings, totalWinnings = 0;
        String input;
        char replay;
        boolean fPair = false, sPair = false, checker = false;
        int slots[] = new int[3];
        String names[] = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
        Random rng = new Random();
        Scanner kb = new Scanner(System.in);

        do {
            //INPUT
            System.out.println("\nWELCOME TO GAMBLE CENTRAL VIRTUAL SLOTS MACHINE");
            System.out.print("Enter amount of money to gamble: $");
            enteredMoney = kb.nextDouble();
            while (enteredMoney <= 0) {
                System.out.println("ERROR: INVALID AMOUNT OF MONEY.");
                System.out.print("Enter amount of money to gamble: $");
                enteredMoney = kb.nextDouble();
            }
            totalMoney = enteredMoney + totalMoney;
            // Re-initialization of needed boolean values
            checker = false;
            fPair = false;
            sPair = false;
        
            // OUTPUT
            System.out.println("\nSLOTS MACHINE");
                System.out.print("| ");
                for (int i = 0; i < slots.length; i++) {
                    slots[i] = rng.nextInt(5);
                    //slots[i] = 3;
                    int conversion = slots[i];

                    System.out.print(names[conversion] + " | ");
                }
                System.out.println("\n");

                // Checking of slot value
                if (slots[0] == slots[1] || slots[0] == slots[2]) {
                    fPair = true;
                }

                if (slots[1] == slots[2]) {
                    sPair = true;
                }

                // Checking for hit pairs or jackpot
                if (fPair == true && sPair == true){
                    winnings = enteredMoney * 3;
                    System.out.println("JACKPOT WON!!!");
                    System.out.printf("Your winnings: $%.2f\n", winnings);
                }

                else if (fPair == true || sPair == true) {
                    winnings = enteredMoney * 2;
                    System.out.println("Got a pair!");
                    System.out.printf("Your winnings: $%.2f\n", winnings);
                }

                else {
                    winnings = enteredMoney * 0;
                    System.out.println("Too bad, better luck next time.");
                    System.out.printf("Your winnings: $%.2f\n", winnings);
                }

                totalWinnings = totalWinnings + winnings;
                kb.nextLine(); // Needed to initialize next input? Without this, it ends in an error that is related to preconditions?
                System.out.println();

                System.out.println("Do you still want to play?");
                System.out.print("Enter Y for yes or N for no: ");
                input = kb.nextLine(); // Get string instead of character, then siphon the first character from the inputted string
                replay = input.charAt(0); // Within the char data type, it needs to have an initial string to get from first.

                // Check whether the inputted character reflects that of the system's needs.
                if (replay == 'Y' || replay == 'y' || replay == 'N' || replay == 'n') {
                    checker = true;
                }
                else {
                    while (checker == false) {
                        System.out.println("ERROR: INVALID INPUT");
                        System.out.print("Please enter Y for yes or N for no: ");
                        input = kb.nextLine(); // Get string instead of character, then siphon the first character from the inputted string
                        replay = input.charAt(0); // Within the char data type, it needs to have an initial string to get from first.
                        if (replay == 'Y' || replay == 'y' || replay == 'N' || replay == 'n') {
                            checker = true;
                        }
                    }
                }
        } while (replay == 'Y' || replay == 'y');

        System.out.println("\nRESULTS: ");
        System.out.printf("Total amount of money entered: $%.2f\n", totalMoney);
        System.out.printf("Total amount of winnings: $%.2f", totalWinnings);
    }
}