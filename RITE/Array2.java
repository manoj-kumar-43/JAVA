import java.util.*;
class Array2
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the size of an array");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("plz enter "+size+" no. of elements");
        for(int i=0; i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Element are : ");
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}