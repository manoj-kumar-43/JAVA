class Floatbinary 
{
    public static void main(String[] arg)
    {
        float f=20.5f;
        int bit=Float.floatToIntBits(f);
        String b=Integer.toBinaryString(bit);
        System.out.println(b);
    }

}
