class test
{
    int add(int i, int j)
    {
        int r=i+j;
        return r;
    }
    public static void main(String[] args) 
    {
        test obj=new test();
        int result=obj.add(100,200);
        System.out.println(result);    
    }
}