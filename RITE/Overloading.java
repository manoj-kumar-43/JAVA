class Test 
{
    public int Add(int i, int j)
    {
        return i+j;
    }
    public float Add(float i, float j)
    {
        return i+j;
    }
}
class demo
{
    public static void main(String[] args) 
    {
        Test obj = new Test();
        System.out.println(obj.Add(100,200));
        System.out.println(obj.Add(10.3f,20.4f));
    }
}
