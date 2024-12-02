public class lab4_program1 {
    public static void main(String[] args) {
        String exampleString = "16lease";
        int pos = 0;

        showChar(exampleString, pos);
    }
    
    public static void showChar(String charString, int num) {
        Character result = charString.charAt(num);

        System.out.println("String reference: " + charString + "\nPosition of character: " + num + "\nResult: " + result);
    }
}