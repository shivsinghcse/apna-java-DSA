package Java_Programming_Language.variables_and_datatypes;

import java.util.*;

public class Sum_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = a + b;
        System.out.println(sum);
    }
}
