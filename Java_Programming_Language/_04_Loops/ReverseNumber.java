package Java_Programming_Language._04_Loops;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 10899;
        int reverse = 0;
        int lastDigit = 0;

        while (n > 0) {
            lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
