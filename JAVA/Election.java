import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println(age+"Manoj is elegible for election");
        }
        else
        {
            System.out.println(age+"Manoj is not elegible for election");
        }
    }
}