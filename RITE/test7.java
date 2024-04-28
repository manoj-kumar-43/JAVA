import java.io.*;
class test7
{
    public static void main(String[] args)throws Exception 
    {
        FileReader f=new FileReader("Manoj.txt");
        int i;
        while((i=f.read()) !=-1)
        System.out.print((char)i);    
    }    
}
