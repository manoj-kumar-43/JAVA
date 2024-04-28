import java.util.*;

class Arithematic {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition Result is = " + (a + b));
        System.out.println("Substraction Result is = " + (a - b));
        System.out.println("Multiplication Result is = " + (a * b));
    }
}