import java.util.*;
class demo
{
    public static void main(String[] arg)
    {
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();

        if(a%2==0)
        {
            System.out.println("even no.");
        }
        else
        {
            System.out.println("odd no.");
        }
    }
}