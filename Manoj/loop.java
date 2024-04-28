import java.util.*;
class loop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter a no.");
        int i = sc.nextInt();
        while(!(i>=0 && i<=10))
        {
            System.out.println(i);
            System.out.println("plz enter a no.");
            i = sc.nextInt();
        }
    }
}