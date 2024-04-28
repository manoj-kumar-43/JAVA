import java.util.*;
class PrimeorComposite
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n))
        {
            System.out.println(n+" is a prime number");
        }
        else
        {
            System.out.println(n+" is a composite number");
        }
    }
    public static boolean isPrime(int num) 
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}