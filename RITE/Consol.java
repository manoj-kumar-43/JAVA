import java.io.*;
class Consol
{
    public static void main(String[] args) throws Exception 
    {
        Console c = System.console();
        System.out.println("Enter uid");
        String uid=c.readLine();
        System.out.println(uid);
        
        System.out.println("Enter password");
        char []password=c.readPassword();
        for(char ch:password)
        {
            System.out.println(ch);
        }
    }
}