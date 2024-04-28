public class Method1 
{
  static void myMethod(String fname) 
  {
    System.out.println("Name: "+fname);   //fname is parameter
  }

  public static void main(String[] args) 
  {
    // Manoj, Arjun, Rinku are arguments
    myMethod("Manoj");
    myMethod("Arjun");
    myMethod("Rinku");
  }
}