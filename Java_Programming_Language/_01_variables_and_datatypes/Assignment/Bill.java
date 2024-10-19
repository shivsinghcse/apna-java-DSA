package Java_Programming_Language._01_variables_and_datatypes.Assignment;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        sc.close();
        float total = pen + pencil + eraser;
        float gst = total * 1.8f;

        float totalBill = total + gst;

        System.out.println("Total bill amount with 18% GST: " + totalBill);
    }
}
