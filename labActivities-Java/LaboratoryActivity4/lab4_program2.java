import java.util.*;

public class lab4_program2 {
    public static void main(String[] args) {
        Random rand = new Random();

        String chosen = "";
        Boolean winner = false;
        Scanner in = new Scanner(System.in);
        
        /* For game choices:
         * 1 = Rock
         * 2 = Paper
         * 3 = Scissors
        */

        System.out.println("\nROCK PAPER SCISSORS GAME!\nGame ends when one is declared a winner!");

        while (winner == false) {
            int playerChoose = 0;
            int comChoose = rand.nextInt(4);
            while (comChoose <= 0) { // Makes sure that the random number generated is only 1 through 3.
                comChoose = rand.nextInt(4);
            }

            //System.out.println("FOR TESTING PURPOSES: " + comChoose);
            
            while (playerChoose <= 0 || playerChoose > 3) {
                System.out.println("Choices: (Enter the number equivalent)\n1.) Rock\n2.) Paper\n3.) Scissors");
                System.out.print("Choose one: ");
                playerChoose = in.nextInt();
                if (playerChoose <= 0 || playerChoose > 3) {
                    System.out.println("ERROR: INVALID CHOICE\n");
                }
            }
            
            System.out.println("\nRESULTS:");
            if (playerChoose == 1) { // Rock
                
                winner = chooseRock(comChoose);
            }

            else if (playerChoose == 2) { // Paper
                winner = choosePaper(comChoose);
            }

            else if (playerChoose == 3) { // Scissors
                winner = chooseScissors(comChoose);
            }
        }

    }

    public static Boolean chooseRock(int com) {
        Boolean decider = false;
        if (com == 1) {
            System.out.println("Player choosed: Rock");
            System.out.println("Computer choosed: Rock");
            System.out.println("TIE!\nGame will be played again.");
            return decider;
        }

        else if (com == 2) {
            System.out.println("Player choosed: Rock");
            System.out.println("Computer choosed: Paper");
            System.out.println("Player Lose!\nBetter luck next time.");
            decider = true;
            return decider;
        }

        else if (com == 3) {
            System.out.println("Player choosed: Rock");
            System.out.println("Computer choosed: Scissors");
            System.out.println("Player Win!\nCongratulations!!! YIPPEE");
            decider = true;
            return decider;
        }

        return decider;
    }

    public static Boolean choosePaper(int com) {
        Boolean decider = false;
        if (com == 1) {
            System.out.println("Player choosed: Paper");
            System.out.println("Computer choosed: Rock");
            System.out.println("Player Win!\nCongratulations!!! YIPPEE");
            decider = true;
            return decider;
        }

        else if (com == 2) {
            System.out.println("Player choosed: Paper");
            System.out.println("Computer choosed: Paper");
            System.out.println("TIE!\nGame will be played again.");
            return decider;
        }

        else if (com == 3) {
            System.out.println("Player choosed: Paper");
            System.out.println("Computer choosed: Scissors");
            System.out.println("Player Lose!\nBetter luck next time.");
            decider = true;
            return decider;
        }

        return decider;
    }

    public static Boolean chooseScissors(int com) {
        Boolean decider = false;
        if (com == 1) {
            System.out.println("Player choosed: Scissors");
            System.out.println("Computer choosed: Rock");
            System.out.println("Player Lose!\nBetter luck next time.");
            decider = true;
            return decider;
        }

        else if (com == 2) {
            System.out.println("Player choosed: Scissors");
            System.out.println("Computer choosed: Paper");
            System.out.println("Player Win!\nCongratulations!!! YIPPEE");
            decider = true;
            return decider;
        }

        else if (com == 3) {
            System.out.println("Player choosed: Scissors");
            System.out.println("Computer choosed: Scissors");
            System.out.println("TIE!\nGame will be played again.");
            return decider;
        }

        return decider;
    }

}
