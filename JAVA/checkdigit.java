import java.util.Scanner;

class checkdigit
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<10)
        {
            System.out.println(a+" is a single digit no.");
        }
        if(a>10 && a<100)
        {
            System.out.println(a+" is a double digit no.");
        }
        if(a>100 && a<1000)
        {
            System.out.println(a+" is a triple digit no.");
        }
    }
}