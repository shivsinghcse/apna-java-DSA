package Java_Programming_Language._04_Loops;

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 10000000) {
            System.out.println(counter + " Hello World!");
            counter++;
        }

        System.out.println("Printed Hello World! 100x");
    }
}
