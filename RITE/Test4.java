class Demo
{
    int i=100;
    public void show()
    {
        System.out.println(this.i);
    }
}
class test
{
    public static void main(String[] args) 
    {
        Demo obj=new Demo();
        System.out.println(obj.i);
        obj.show();    
    }
}