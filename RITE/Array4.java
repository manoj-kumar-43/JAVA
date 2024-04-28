import java.util.*;
class Array4
{
    public static void main(String[] args) 
    {
        System.out.println("Enter row and col of an array");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        System.out.println("Enter: "+(row*col)+"no. of elements");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Element are:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}