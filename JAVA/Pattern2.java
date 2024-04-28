import java.util.*;
/**
 * Pattern2
 */
public class Pattern2 
{

    public static void main(String[] arg)
    {
        int n = 7;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
