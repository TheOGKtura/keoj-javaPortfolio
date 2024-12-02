import java.util.Random;

public class LottoDraw {
    final private String[] drawnChances = new String[3];

    public LottoDraw(Character in) {
        if ((in == 'Y') || (in == 'y')) {

        }

        else if ((in == 'N') || (in == 'n')) {
            
        }
    }

    public String[] Draw() {
        Random rng = new Random();

        for (int i = 0; i < drawnChances.length; i++) {

            if (rng.nextInt(2) == 0) {
                drawnChances[i] = "LANCE";
            }
            else if (rng.nextInt(2) == 1) {
                drawnChances[i] = "KEOJ";
            }
        }

        return drawnChances;
    }
}
