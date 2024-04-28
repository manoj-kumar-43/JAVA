import java.util.*;
class demo
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Not Adult");
        }
    }
}