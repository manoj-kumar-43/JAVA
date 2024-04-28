import java.util.*;
class Exception
{
    public static void main(String[] args) 
    {
        System.out.println("Enter two num");
        try
        {
            Scanner sc = new Scanner(System.in);
            int i=sc.nextInt();
            int j=sc.nextInt();
            System.out.println("Sum: "+(i+j)+" Div: "+(i/j));    
        }
        catch(InputMismatchException e)
        {
            System.out.println("Plz enter num...not str");
        }
        catch(ArithmeticException e)
        {
            System.out.println("0 not allowed");
        }
    }
}
