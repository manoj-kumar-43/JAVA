import java.util.*;
class EvenOdd
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}