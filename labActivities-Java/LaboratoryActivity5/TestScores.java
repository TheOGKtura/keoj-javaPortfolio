public class TestScores {
    private int[] score = {};

    public TestScores(int num) {
        score = new int [num];
    }

    public void setScore(int num, int s) {
        score[num] = s;
    }

    public int getScore(int num) {
        num = num - 1;
        return score[num];
    }

    public double Average() {
        double holder = 0; // Sum of scores
        for (int i = 0; i < score.length; i++) {
            if (i == 0) {
                holder = score[i];
            }

            else {
                holder += score[i];
            }
        }

        // Total number of tests divided to total sum of all scores
        holder = holder / score.length;

        return holder;
    }
}
