import java.util.Scanner;

public class MP_THREE {
    public static void main(String[] args) {
        double milesDriven;
        double gasUsed;
        double MPG;


        Scanner input = new Scanner(System.in);
        
        System.out.println("INPUT: ");
        System.out.print("Enter amount of miles driven: ");
        milesDriven = input.nextDouble();
        System.out.print("Enter gallons of gas used: ");
        gasUsed = input.nextDouble();

        MPG = milesDriven / gasUsed;

        System.out.println("\nOUTPUT: ");
        System.out.printf("Amount of miles driven: %.2f\n", milesDriven);
        System.out.printf("Gallons of gas used: %.2f\n", gasUsed);
        System.out.printf("The car's MPG: %.2f", MPG);
    }
}
