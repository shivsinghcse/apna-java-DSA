package Java_Programming_Language.variables_and_datatypes.Assignment;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        sc.close();

        int area = side * side;
        System.out.println("Area of square: " + area);
    }
}
