import java.util.*;
class demo
{
    public static void main(String[] arg)
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=2; i<=10; i++)
        {
            System.out.println(n*i);
        }
    }
}