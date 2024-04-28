import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
class test
{
    public static void main(String[] args) throws Exception
    {
        FileReader f=new FileReader("manoj.test");
        try
        {
            int i=f.read();
            System.out.println((char)i);
            int num = new Scanner(System.in).nextInt();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            f.close();
            System.out.println("Cleanup code.....");
        }
    }
}