class Test
{
    int a,b;
    Test(int x, int y)
    {
        a=x;
        b=y;
        System.out.println("Multiplication Result = "+a*b);
    }
    void display()
    {
        System.out.println("This is an example of parameterized constructor");
    }
    public static void main(String[] args) 
    {
        Test obj = new Test(10, 11);
        obj.display();
        Test obj1= new Test(5, 5);
        obj1.display();    
    }
}