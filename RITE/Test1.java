class Test1
{
    int eid;
    String ename;
    static String company="seeree";
}
class Employee
{
    public static void main(String[] args) 
    {
        Test1 e1=new Test1();
        Test1 e2=new Test1();
        System.out.println(e1.company); 
        System.out.println(e2.company);   
    }
}