class Demo
{
    void display(int a)
    {
        System.out.println("First no. is: "+a);
    }
    void display(int x, int y)
    {
        System.out.println("Second no. is: "+x);
        System.out.println("Third no. is: "+y);
    }
}
class Test
{
    public static void main(String[] args) 
    {
        Demo obj = new Demo();
        obj.display(10);
        obj.display(5,10);
        obj.display(8);    
    }
}