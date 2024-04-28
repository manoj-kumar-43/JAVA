class Counter
{
    int Count;
    Counter()
    {
        Count ++;
    }
}
class test
{
    public static void main(String[] args) 
    {
        Counter obj = new Counter();
        Counter obj1 = new Counter();
        System.out.println(obj.Count);
        System.out.println(obj1.Count);
    }
}