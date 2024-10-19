package Java_Programming_Language._04_Loops;

public class PrintReverseNumber {
    public static void main(String[] args) {
        int n = 3436;

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.println(lastDigit);
            n = n / 10;
        }
        
    }
}
