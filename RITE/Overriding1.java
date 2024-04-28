class PClass
{
   int i = 100;
   void show()
   {
      System.out.println("parent show");
   }
}
class test extends PClass
{
    int i = 200;
    void show()
    {
        System.out.println("child show");
    }
    public static void main(String[] args) 
    {
        PClass obj=new test();
        System.out.println(obj.i);
        obj.show();
    }
}
