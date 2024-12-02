import java.util.*;

public class lab6_program4 {
    public static void main(String[] args) {
        //ArrayList<Integer> cells = new ArrayList<Integer>();
        int[][] grid = new int[3][3];
        Boolean[][] RC = new Boolean[2][3];
        Boolean[] diag = new Boolean[2];

        Random rng = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Lo Shu Square Checker\nThe square that makes up the Sudoku square!\n");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < 3; j++) {
                int val = 0;

                System.err.println("--> For row " + i + " and column " + j);
                while ((val < 1) || (val > 9)) {
                    System.out.print("Enter value: ");
                    val = in.nextInt();

                    if ((val < 1) || (val > 9)) {
                        System.out.println("ERROR: INVALID NUMBER. PLEASE ENTER A NUMBER ONLY FROM 1-9\n");
                    }

                    else {
                        grid[i][j] = val;
                    }
                }
            }
        }
        System.out.println("\nUSER'S GRID:");
        showArray(grid);
        System.out.println("\nRESULTS:");
        checkLoShuSquare(grid);
    }
    /**
       The showArray method displays the contents of a two-dimensional int array.
       @param array The array to display.
    */
    private static void showArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            System.out.print("   ");
            for (int col = 0; col < array[row].length; col++)
                System.out.print(array[row][col] + " ");
            System.out.println();
        }
    }

    private static void checkLoShuSquare(int[][] array) {
        int temp = 0;
        int ctr = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                temp += array[row][col];

                if (col == array[row].length - 1) {
                    System.out.println("Row " + (row + 1) + " equates to " + temp);
                    temp = 0;
                }
            }
        }

        for (int col = 0; col < array.length; col++) {
            for (int row = 0; row < array[col].length; row++) {
                temp += array[row][col];

                if (row == array[col].length - 1) {
                    System.out.println("Column " + (col + 1) + " equates to " + temp);
                    temp = 0;
                }
            }
        }

        // Lower-diagonal
        for (int i = 0; i < 3; i++) {
            temp += array[i][i];
        }
        System.out.println("Cell (1,1) to Cell (3,3) equates to " + temp);
        temp = 0;

        // Upper-diagonal
        for (int i = 2; i > -1; i--) {
            // System.out.println(ctr);
            temp += array[ctr][i];
            ctr++;
        }
        System.out.println("Cell (1,3) to Cell (3,1) equates to " + temp);
        temp = 0;
    }
}
