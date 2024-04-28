class User
{
    int sum=0;
    public int Manoj(int a, int b)
    {
        sum= a+b;
        return sum;
    }
}
class demo
{
    public static void main(String[] args) 
    {
        User obj = new User();
        int sum = obj.Manoj(5,10);
        System.out.println("Your Result = "+sum);

    }
}
