class Sujit
{
    void display()
    {
        System.out.println("This is Sujit");
    }
}
class Manoj extends Sujit
{
    void show()
    {
        System.out.println("This is Manoj");
    }
}
class Demo
{
    public static void main(String[] args) 
    {
        Manoj obj = new Manoj();
        obj.display();
        obj.show();
    }
}