package Java_Programming_Language._04_Loops;

import java.util.Scanner;

public class PrintNumbersOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        sc.close();
        int counter = 1;

        while( counter <= range){
            System.out.println(counter);
            counter++;
        }
    }
}
