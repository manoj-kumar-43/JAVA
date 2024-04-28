import java.util.*;
class Function
{
    public static void main(String[] args) 
    {
        System.out.println("Enter three number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int average=(a+b+c)/3;
        System.out.println(average+" is the average of these three number");
    }
}