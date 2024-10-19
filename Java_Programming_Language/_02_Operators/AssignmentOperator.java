package Java_Programming_Language._02_Operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println(a); // 10
        System.out.println(b); // 10
        System.out.println(a += b); // 20
        System.out.println(a -= b); // 10
        System.out.println(a *= b); // 100
        System.out.println(a /= b); // 10
    }
}
