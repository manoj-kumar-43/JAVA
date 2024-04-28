class pattern
{
    public static void main(String[] arg)
    {
        int n=4;
        int m=5;
        // outer loop
        for(int i=1;i<=n;i++)          //n = 4
        {
            // inner loop
            for(int j=1;j<=m;j++)      //m = 5
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}