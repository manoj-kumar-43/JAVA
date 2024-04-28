import java.util.*;
class Test
{
    int add(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
}
class Demo
{
    public static void main(String[] args) 
    {
        Test obj = new Test();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum=obj.add(x, y);
        System.out.println("Sum of input number is = "+sum);
    }
}