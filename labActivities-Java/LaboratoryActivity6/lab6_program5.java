import java.util.Scanner;

public class lab6_program5 {
    public static void main(String[] args) {
        int checker = 0;
        Boolean lengthCheck = false;
        Scanner in = new Scanner(System.in);
        AccNumChecker accTest = new AccNumChecker();

        System.out.println("Company XX Account Number Checker\nShould be 7 numbers in length\nLeft-most number should not be a 0\n");
        while (lengthCheck == false) {
            System.out.print("Enter an account number: ");
            checker = in.nextInt();

            if (String.valueOf(checker).length() == 7) {
                lengthCheck = true;
            }
            
            else {
                System.out.println("ERROR: INVALID INPUT. PLEASE FOLLOW THE GUIDELINES FOR CHECKING");
                lengthCheck = false;
            }
        }

        System.out.println("Validity of Account Number: " + checker);
        if (accTest.Check(checker) == false) {
            System.out.println("-> INVALID");
        }
        else {
            System.out.println("-> VALID");
        }
    }
}
