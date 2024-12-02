import java.util.Scanner;

public class MP_SEVEN {
    public static void main(String[] args) {
        double classAmount;
        double maleCount;
        double femaleCount;
        double malePercentage;
        double femalePercentage;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of male students: ");
        maleCount = input.nextDouble();
        System.out.print("Enter amount of female students: ");
        femaleCount = input.nextDouble();

        classAmount = maleCount + femaleCount;

        malePercentage = (maleCount / classAmount) * 100;
        femalePercentage = (femaleCount / classAmount) * 100;
        
        // Use double percentage to display percentage
        System.out.println("\nRESULTS: ");
        System.out.printf("Total amount of students in the class: %.0f\n", classAmount);
        System.out.printf("Amount of males in the class: %.2f%%\n", malePercentage);
        System.out.printf("Amount of females in the class: %.2f%%\n", femalePercentage);
    }
}
