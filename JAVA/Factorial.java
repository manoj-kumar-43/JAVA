import java.util.*;
class Factorial
{
    public static void printFactorial(int n)
    {
        if(n<0)
        {
            System.out.println("Invalid number");
        }
        int Factorial=1;
        for(int i=n; i>=1; i--)
        {
            Factorial=Factorial*i;
        }
        System.out.println(Factorial);
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        printFactorial(n);
    }
}
