package Java_Programming_Language._01_variables_and_datatypes.Assignment;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        int average = (num1 + num2 + num3) / 3;

        System.out.println("Average is: " + average);
    }
}
