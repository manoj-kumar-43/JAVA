class Demo
{
    private int i=100;
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
        obj.show();    
    }
}