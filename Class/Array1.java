class Array1
{
    public static void main(String[] args) 
    {
        int arr[]=new int[5];
        arr[0]=5;
        arr[1]=15;
        arr[2]=22;
        arr[3]=38;
        arr[4]=45;
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Array Element: "+arr[i]);
        }
    }
}