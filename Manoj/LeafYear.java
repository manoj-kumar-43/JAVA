import java.util.*;

class LeafYear {

    public static void main(String[] arg) {
        System.out.println("Welcome to LeafYear calculator\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Plz enter the years: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leaf year");
        } else {
            System.out.println(year + " is not a leaf year");
        }
    }
}