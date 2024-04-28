import java.util.*;
public class function
{
    public static void printMyName(String name)
    {
        System.out.println(name);
        
    }
    public static void main(String[] args)
    {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);
    }
}
