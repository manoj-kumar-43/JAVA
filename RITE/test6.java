import java.io.*;
class test6 
{
    public static void main(String[] args)throws Exception 
    {
        FileReader f=new FileReader("Manoj.txt");
        int i=f.read();
        System.out.println((char)i);    
    }    
}
