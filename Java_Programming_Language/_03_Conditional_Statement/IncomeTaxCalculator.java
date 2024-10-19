package Java_Programming_Language._03_Conditional_Statement;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        int income = 1550000;
        float tax;
        if (income < 500000) {
            tax = income * 0;
        } else if (income >= 500000 && income <= 1000000) {
            tax = income * 0.2f;
        } else {
            tax = income * 0.3f;
        }
        System.out.println("Your tax is : " + tax);
    }
}
