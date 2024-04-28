import java.util.Scanner;

public class demo1 
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        if(n==1)
        {
            System.out.println("Good Morning");
        }
        else if(n==2)
        {
            System.out.println("Good Afternoon");
        }
        else if(n==3)
        {
            System.out.println("Good Evening");
        }
        else if(n==4)
        {
            System.out.println("Good Night");
        }
        else
        {
            System.out.println("Invalid");
        }
    }    
}