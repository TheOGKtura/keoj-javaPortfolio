import java.util.Scanner;

public class machineproblemOne {
    public static void main(String[] args) {
        int num;
        String[] onesRoman = {null, "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tensRoman = {null, "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String hundredRoman = "C";
        
        Scanner input = new Scanner(System.in);

        System.out.println("ROMAN NUMERAL CONVERSION PROGRAM");
        System.out.println("ONLY NUMBERS 1-100");
        System.out.print("Enter a number to be converted into a Roman Numeral: ");
        num = input.nextInt();
        System.out.print("\nRESULT: ");

        int ones = (num/1) % 10;
        int tens = (num/10) % 10;
        // int hundreds = (num/100) % 10; // In case if hundreds are needed.

        if (num <= 0 || num > 100) {
            System.out.println("ERROR: INVALID NUMBER");
        }

        else {
            // System.out.println("ONES: " + ones + "\nTENS: " + tens + "\nHUNDREDS: " + hundreds);
            if (num == 100) {
                System.out.println(hundredRoman);
            }

            for (int i = 0; i < 10; i++){
                if (tens == i) {
                    if (tensRoman[tens] == null) {
                        break;
                    }
                    else {
                        System.out.print(tensRoman[tens]);
                        break;
                    }
                }
            }

            for (int i = 0; i < 10; i++){
                if (ones == i) {
                    // System.out.println(ones + " = " + i);
                    if (onesRoman[ones] == null) {
                        break;
                    }
                    else {
                        System.out.print(onesRoman[ones]);
                        break;
                    }
                }
            }
        }
    }
}