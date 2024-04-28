import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
class test8
{
    public static void main(String[] args)throws Exception 
    {
        BufferedReader br=new BufferedReader(new FileReader("Rinku.txt"));
        String line;
        while ((line=br.readLine())!=null) 
        {
            System.out.println(line);    
        }    
    }
}