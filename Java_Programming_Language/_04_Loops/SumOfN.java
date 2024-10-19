package Java_Programming_Language._04_Loops;
import java.util.Scanner;
public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        int sum = 0;

        while( i <= n){
           sum += i;
            i++;
        }

        System.out.println("sum is : " + sum);
    }
}
