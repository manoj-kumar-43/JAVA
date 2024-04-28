import java.util.*;
class Demo
{
    static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("not valid");
        }
    }
    public static void main(String[] args) 
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            validate(age);
            System.out.println("join...");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }    
    }
}