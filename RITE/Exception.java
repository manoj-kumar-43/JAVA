import java.util.*;
class Exception
{
    public static void main(String[] args) 
    {
        System.out.println("Enter two num");
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        System.out.println("Sum: "+(i+j)+" Div: "+(i/j));    
    }
}
