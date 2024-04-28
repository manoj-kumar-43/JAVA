import java.util.*;
public class LinearSearch 
{
    public static void main(String[] args) 
    {
        int arr[]= new int[]{11,2,9,13,57,25,27};
        System.out.println("Enter element to be search ?");
        int search = new Scanner(System.in).nextInt();
        int Flag = 0;
        int index = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                Flag=1;
                index=i;
                break;
            }
        }
        if(Flag==1)
        {
            System.out.println("Search successfull at index no. is: "+index);
        }
        else
        {
            System.err.println("Not found...");
        }
    }    
}
