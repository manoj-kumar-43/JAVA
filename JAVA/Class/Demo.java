public class Demo
{
    public static void main(String[] arg)
    {
        int x=5, y=6, z=30;
        Boolean a,b;

        b=(x<y) && (z>y);
        a=(x>=y) && (y<z) || (z>x);
        System.out.println("display a");
        System.out.println("display b");
    }
}