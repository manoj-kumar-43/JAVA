class array
{
    public static void main(String[] args) 
    {
        int [][]multiArray={{1,2,3},{4,5,},{6,7,8,9}};
        
        for(int i=0; i<multiArray.length; i++)
        {
            System.out.println("Length of array at index = "+i+":"+multiArray[i].length);
        }
    }
}