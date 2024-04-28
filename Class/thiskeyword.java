class Test
{
    int x;
    String name;
    float y;
    Test(int x,String name,float y)
    {
        this.x=x;
        this.name=name;
        this.y=y;
    }
    void display()
    {
        System.out.println(x+" "+name+" "+y);
    }    
}
class Demo
{
    public static void main(String[] args) 
    {
        Test obj1=new Test(111,"Manoj",500f);
        obj1.display();
        Test obj2=new Test(222,"Rinku", 600f);
        obj2.display();
    }
}