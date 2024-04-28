import java.util.*;
class Test
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.next();
        
        System.out.println("Enter age");
        int age  = sc.nextInt();

        System.out.println("Name is : "+name);
        System.out.println("age is : "+age);
    }
}