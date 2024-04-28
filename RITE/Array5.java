import java.util.*;
class Array5
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the row of an array");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int arr[][]=new int[row][];
        int totalcol=0;

        for(int r=0; r<row; r++)
        {
            System.out.println("Enter: "+r+" 0th col size");
            int col=sc.nextInt();
            arr[r]=new int[col];
            totalcol=totalcol+col;
        }
        System.out.println("Element: "+(totalcol)+" no. of element");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements are: ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}