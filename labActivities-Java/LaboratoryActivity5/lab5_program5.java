import java.util.Scanner;

public class lab5_program5 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Variables
        int cpuScore = 0, playerScore = 0, ctr = 0;;
        String conv, charInit = "o";
        char choice = charInit.charAt(0);
        Boolean choiceState = false;

        // Objects
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        Blackjack Game = new Blackjack();
        
        System.out.println("GAME OF BLACKJACK (DICE EDITION)");
        while (Game.getGameState() == false) {
            ctr++;
            System.out.println("\nROLL #" + ctr);
            choiceState = false;
            currentRoll(Game);

            if (Game.getPlayerTotal() > 21) {
                System.out.println("\nYou have over 21 points.");
                System.out.println("YOU LOSE!");
                Game.setGameState(true);
                choiceState = true;
            }

            else if (Game.getPlayerTotal() == 21) {
                System.out.println("\nYou have exactly 21 points.");
                System.out.println("YOU WIN!");
                Game.setGameState(true);
                choiceState = true;
            }

            else {
                while (choiceState == false) {
                    System.out.print("Proceed? ");
                    conv = in.nextLine();
                    choice = conv.charAt(0);
    
                    // System.out.println(choice);
                    if (choice == 'Y' || choice == 'y') {
                        choiceState = true;
                        Roll(Game);
                        // System.out.println("YES");
                    }
    
                    else if (choice == 'N' || choice == 'n') {
                        choiceState = true;
                        System.out.println("\nRESULTS:");
                        // System.out.println("NO");

                        if (Game.getCPUTotal() > 21 && Game.getCPUTotal() > Game.getPlayerTotal()) {
                            showPoints(Game);
                            System.out.println("YOU WIN!");
                            Game.setGameState(true);
                        }

                        else if (Game.getCPUTotal() <= 21 && Game.getCPUTotal() > Game.getPlayerTotal()) {
                            showPoints(Game);
                            System.out.println("YOU LOSE!");
                            Game.setGameState(true);
                        }

                        else if (Game.getPlayerTotal() <= 21 && Game.getPlayerTotal() > Game.getCPUTotal()) {
                            showPoints(Game);
                            System.out.println("YOU WIN!");
                            Game.setGameState(true);
                        }

                        else if (Game.getPlayerTotal() == Game.getCPUTotal()) {
                            System.out.println("DRAW! Play again.");
                        }
                    }
    
                    else {
                        System.out.println("ERROR: INVALID INPUT. PLEASE INPUT YOUR CHOICE AGAIN");
                    }
                }
            }

        }
    }

    public static void currentRoll(Blackjack g) {
        System.out.println("You rolled: " + g.getD1Player() + " and " + g.getD2Player());
        System.out.println("Total points: " + g.getPlayerTotal());
    }

    public static void Roll(Blackjack g) {
        g.cpuRoll();
        g.playerRoll();
    }

    public static void showPoints(Blackjack g) {
        System.out.println("CPU POINTS: " + g.getCPUTotal());
        System.out.println("YOUR POINTS: " + g.getPlayerTotal());
    }
}
