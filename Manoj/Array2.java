public class Array2 
{   
    public static void main(String[] args)
    {
        int []arr=new int[]{12,56,7,89,34};
        for(int i:arr)
        {
            if(i>60)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
