import java.util.*;

public class Sorter {
    // This program removes values in arrays from highest to lowest.
    public static void main(String[] args) {
        Integer[] arr = {5, 4, 7, 8, 12, 11, 11, 11}, target = new Integer[arr.length];
        int highest, change = 0, compare = 0;
        
        for (int i = 0; i < arr.length; i++) {
            target[i] = arr[i];
        }

        // Initial sort
        Arrays.sort(arr);

        // System.out.println(Arrays.toString(target));
        // System.out.println("LENGTH = " + arr.length);

        for (int j = 0; j < target.length + 1; j++) {
            System.out.println("TARGET ARRAY: " + Arrays.toString(target));
            System.out.println("GIVEN ARRAY: " + Arrays.toString(arr));
            highest = arr.length - 1;
            System.out.println("HIGHEST: " + arr[highest]);

            for (int k = target.length - 1; k > -1; k--) {
                if (target[k].equals(arr[highest])) {
                    change = target[k];
                }
                
                if (k == 0) {
                    compare = Arrays.asList(target).get(Arrays.asList(target).indexOf(change));
                }
            }

            target[Arrays.asList(target).indexOf(compare)] = 0;
            
            // System.out.println(highest);

            // Makes it so last digit defaults to 0
            if (j == target.length) {
                change = 0;
            }

            arr[highest] = 0;
            // Sort array again after initialization of new values.
            Arrays.sort(arr);
            
            System.out.println("CHANGE: " + change + "\n");
        }
    }
}
