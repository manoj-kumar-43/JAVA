class PClass
{
   int i = 100;
}
class test extends PClass
{
    int i = 200;
    test()
    {
        System.out.println(super.i);
    }
    public static void main(String[] args) 
    {
        test obj = new test();
        System.out.println(obj.i);
    }
}
