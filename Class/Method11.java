class Test
{
    void display(int num)
    {
        System.out.println("Integer value is: "+num);
    }
    void display(char ch)
    {
        System.out.println("Character value is: "+ch);
    }
}
class Demo
{
    public static void main(String[] args) 
    {
        Test obj = new Test();
        obj.display(5);
        obj.display('M');    
    }
}