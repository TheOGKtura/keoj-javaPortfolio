import java.util.Random;

public class Coin {
    private String sideUp;


    public Coin() {
        sideUp = "";
        Toss();
    }

    public void Toss() {
        Random rng = new Random();
        int side = 0;

        side = rng.nextInt(2);
        
        if (side == 0) {
            sideUp = "Heads";
        }

        else if (side == 1) {
            sideUp = "Tails";
        }

        else {
            System.out.println("ERROR");
        }
    }

    public String getSideUp() {
        return sideUp;
    }
}
