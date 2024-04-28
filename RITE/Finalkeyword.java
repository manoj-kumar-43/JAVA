class volume
{
    final int MAX=100;
}
class test
{
    public static void main(String[] args) 
    {
        volume v=new volume();
        //v.MAX=10; cannot assign a value to final variable MAX
        System.out.println(v.MAX);    
    }
}