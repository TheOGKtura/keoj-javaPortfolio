import java.util.Random;

public class Blackjack {
    private int sides, value, dieOneCPU, dieTwoCPU, dieOnePlayer, dieTwoPlayer, totalCPU, totalPlayer;
    private Boolean gameState;

    public Blackjack() {
        cpuRoll();
        playerRoll();
        gameState = false;
    }

    public int roll() {
        sides = 6;
        Random rng = new Random();
        value = rng.nextInt(sides) + 1;
        return value;
    }

    public void cpuRoll() {
        dieOneCPU = roll();
        dieTwoCPU = roll();
        totalCPU = totalCPU + (dieOneCPU + dieTwoCPU);
    }

    public void playerRoll() {
        dieOnePlayer = roll();
        dieTwoPlayer = roll();
        totalPlayer = totalPlayer + (dieOnePlayer + dieTwoPlayer);
    }

    public Boolean setGameState(Boolean in) {
        gameState = in;
        return gameState;
    }

    // Get methods
    public Boolean getGameState() {
        return gameState;
    }

    public int getSides() {
        return sides;
    }

    // Total sum of all points throughout the round
    public int getCPUTotal() {
        return totalCPU;
    }

    public int getPlayerTotal() {
        return totalPlayer;
    }

    public int getD1CPU() {
        return dieOneCPU;
    }

    public int getD2CPU() {
        return dieTwoCPU;
    }

    public int getD1Player() {
        return dieOnePlayer;
    }

    public int getD2Player() {
        return dieTwoPlayer;
    }
}
