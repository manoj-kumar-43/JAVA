import java.util.*;
class pattern
{
    public static void main(String[] arg)
    {
        int n=5;
        
        for(int i=1; i<=n; i++)     // Outer Loop
        {
            for(int j=1; j<=i; j++)    // inner Loop
            {
                int sum = i+j;
                if(sum % 2 == 0)
                {
                    System.out.print("1 ");     //Even
                }
                else
                {
                    System.out.print("0 ");     //Odd
                }
            }
            System.out.println();
        }
    }
}