class counter
{
    static int count;
    counter()
    {
        count ++;
    }
}
class test
{
    public static void main(String[] args) 
    {
        counter obj=new counter();
        counter obj1=new counter();
        System.out.println(obj.count);
        System.out.println(obj.count);    
    }
}