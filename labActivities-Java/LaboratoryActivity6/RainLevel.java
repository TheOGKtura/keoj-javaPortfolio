public class RainLevel {
    private double[] rainFall = new double[12];
    private String[] months = { "January", "February", "March",
    "April", "May", "June", "July",
    "August", "September", "October",
    "November", "December" };

    public RainLevel(double[] rf) {
        System.arraycopy(rf, 0, rainFall, 0, 12);
    }

    public double[] getRainLevel() {
        return rainFall;
    }

    public double getTotalRainfall() {
        double totalRainfall = 0;
        
        for (int i = 0; i < 12; i++) {
            totalRainfall += rainFall[i];
        }
        return totalRainfall;
    }

    public double getAverageRainfall() {
        double avgRainfall = getTotalRainfall() / 12;

        return avgRainfall;
    }

    public double getMostRainfallMonth() {
        double highest = rainFall[0];
        int pos = 0;

        for (int i = 0; i < rainFall.length; i++) {
            if (rainFall[i] > highest) {
                highest = rainFall[i];
                pos = i;
            }
        }

        for (int j = 0; j < months.length; j++) {
            if (j == pos) {
                System.out.print("MOST: " + months[j] + " has the most rainfall with ");
            }
        }
        return highest;
    }

    public double getLeastRainfallMonth() {
        double lowest = rainFall[0];
        int pos = 0;

        for (int i = 0; i < rainFall.length; i++) {
            if (rainFall[i] < lowest) {
                lowest = rainFall[i];
                pos = i;
            }
        }

        for (int j = 0; j < months.length; j++) {
            if (j == pos) {
                System.out.print("LEAST: " + months[j] + " has the least rainfall with ");
            }
        }
        return lowest;
    }
}
