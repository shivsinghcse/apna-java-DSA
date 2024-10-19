package Java_Programming_Language._03_Conditional_Statement;

public class ElseIf {
    public static void main(String[] args) {
        int age = 11;
        if (age >= 18) {
            System.out.println("adult : drive, vote");
        }else if(age > 13 && age < 18){
            System.out.println("teenager");
        }
        else {
            System.out.println("not adult");
        }
    }
}
