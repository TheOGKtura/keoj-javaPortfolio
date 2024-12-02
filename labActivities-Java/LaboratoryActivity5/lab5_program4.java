public class lab5_program4 {
    public static void main(String[] args) {
        Coin coin = new Coin();
        int headsCount = 0, tailsCount = 0;
        
        for (int i = 0; i < 20; i++) {
            coin.Toss();
            String sideUp = coin.getSideUp();
            if (sideUp == "Heads") {
                System.out.println("HEADS GET!");
                headsCount++;
            }

            else if (sideUp == "Tails" ) {
                System.out.println("TAILS GET!");
                tailsCount++;
            }
        }

        System.out.println("TOTAL HEADS GOT: " + headsCount);
        System.out.println("TOTAL TAILS GOT: " + tailsCount);
    }
}
