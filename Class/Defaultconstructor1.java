class Manoj
{
    void Y()           // User define method
    {
        System.out.println("This is a method");
    }
    Manoj()           //Default Constructor
    {
        System.out.println("This is a default constructor");
    }
    public static void main(String[] args) 
    {
        Manoj obj=new Manoj();
        obj.Y();    
    }
}



//Output
// This is a default constructor
// This is a method