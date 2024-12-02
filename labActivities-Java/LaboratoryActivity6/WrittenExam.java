public class WrittenExam {
    private Character[] givenAnswers = {'B', 'D', 'A', 'A', 'C',
                                     'A', 'B', 'A', 'C', 'D',
                                     'B', 'C', 'D', 'A', 'D',
                                     'C', 'C', 'B', 'D', 'A'};
    private Character[] studentAnswers = new Character[20];

    public WrittenExam(Character[] ansCount) {
        System.arraycopy(ansCount, 0, studentAnswers, 0, studentAnswers.length);
    }

    public Boolean passed() {
        Boolean passedStatus = null;
        int score = 0;

        for (int i = 0; i < givenAnswers.length; i++) {
            if (studentAnswers[i].compareTo(givenAnswers[i]) == 0) {
                score++;
            }
        }

        if (score >= 15) {
            passedStatus = true;
        }

        else {
            passedStatus = false;
        }

        return passedStatus;
    }

    public int totalCorrect() {
        int correct = 0;

        for (int i = 0; i < givenAnswers.length; i++) {
            if (studentAnswers[i].compareTo(givenAnswers[i]) == 0) {
                correct++;
            }
        }

        return correct;
    }

    public int totalIncorrect() {
        int incorrect = 0;

        for (int i = 0; i < givenAnswers.length; i++) {
            if (studentAnswers[i].compareTo(givenAnswers[i]) != 0) {
                incorrect++;
            }
        }

        return incorrect;
    }

    public int questionsMissed() {
        int missed = 0;

        for (int i = 0; i < givenAnswers.length; i++) {
            if (studentAnswers[i].compareTo(' ') == 0) {
                missed++;
            }
        }

        return missed;
    }
}
