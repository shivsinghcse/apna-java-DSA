package Java_Programming_Language._04_Loops;
import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n == 2) {
            System.out.println(" n is Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i*i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("n is Prime");
            } else {
                System.out.println("n is not Prime");
            }
        }
    }
}
