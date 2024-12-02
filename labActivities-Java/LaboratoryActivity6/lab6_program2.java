import java.util.Scanner;

public class lab6_program2 {
    public static void main(String[] args) {
        Character[] answers = new Character[20];
        Character[] choices = {'A', 'B', 'C', 'D'};
        Character conversion = null;
        Scanner in = new Scanner(System.in);
        String reader;
        int comparisonChecker = -1;

        System.out.println("LTO WRITTEN EXAM\n CHOICES: A, B, C, D\n Leave empty then Enter to skip question.");

        for (int i = 0; i < answers.length; i++) {
            while (comparisonChecker != 0) {
                System.out.print("Question #" + (i + 1) + "\nEnter your answer: ");
                reader = in.nextLine();
                if (reader.isEmpty()) { // Checks if student enters nothing, acting as skip
                    comparisonChecker = 0;
                    conversion = ' ';
                    answers[i] = conversion;
                }
                else {
                    conversion = reader.charAt(0);
                }

                // System.out.println("STRING: " + reader);
                // System.out.println("CHAR: " + conversion);

                for (int j = 0; j < choices.length; j++) {
                    if (conversion.compareTo(choices[j]) == 0) {
                        comparisonChecker = conversion.compareTo(choices[j]);
                        break;
                    }
                }
                
                if (comparisonChecker != 0) {
                    System.out.println("ERROR: INVALID CHOICE, PLEASE ENTER ONLY ONE OF THE CHOICES.\n");
                }

                else if (comparisonChecker == 0) {
                    answers[i] = conversion;
                }
            } 
            comparisonChecker = -1;
        }

        // OUTPUT:
        WrittenExam Student = new WrittenExam(answers);
        System.out.println("\nRESULTS: ");
        System.out.println("PASS STATUS: " + Student.passed());
        System.out.println("CORRECT ANSWERS: " + Student.totalCorrect());
        System.out.println("INCORRECT ANSWERS: " + Student.totalIncorrect());
        System.out.println("QUESTIONS MISSED: " + Student.questionsMissed());
    }
}
