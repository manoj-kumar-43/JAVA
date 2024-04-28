abstract class Agenda 
{
     
}
class test extends Agenda
{
    void task1()
    {
        System.out.println("task1 done...");
    }
    public static void main(String[] args) 
    {
        test obj=new test();
        obj.task1();    
    }
}