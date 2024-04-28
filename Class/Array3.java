class Array3
{
    public static void main(String[] args) 
    {
        int arr[][]={{1,2,3},{5,6,7}};
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}