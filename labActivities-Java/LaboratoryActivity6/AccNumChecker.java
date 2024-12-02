import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AccNumChecker {
    final private ArrayList<Integer> accountNumbers = new ArrayList<Integer>();
    
    public AccNumChecker() {
        List<Integer> listings = Arrays.asList(5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 
                                                         8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 
                                                         1005231, 6545231, 3852085, 7576651, 7881200, 4581002);
        accountNumbers.addAll(listings);
    }

    public Boolean Check(int input) {
        Boolean validity = false;

        for (int i = 0; i < accountNumbers.size(); i++) {
            if (input == accountNumbers.get(i)) {
                validity = true;
                break;
            }
        }
        return validity;
    }
}
