package Java_Programming_Language.variables_and_datatypes;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        sc.close();
        float area = 3.14f * radius * radius;
        System.out.println(area); 
    }
}
