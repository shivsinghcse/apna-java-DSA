package Java_Programming_Language._03_Conditional_Statement;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = 43;

        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
