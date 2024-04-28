import java.io.*;
class test 
{
    public static void main(String[] args)throws Exception
    {
        File f=new File("Manoj.txt");
        FileOutputStream fout=new FileOutputStream(f);
        String s = "hello hi bye";
        byte []b = s.getBytes();
        fout.write(b);
        fout.close();
        System.out.println("Write sucessfully......");
    }    
}
