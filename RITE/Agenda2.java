interface Agenda1 
{
    void task1();    
} 
interface Agenda2 
{
    void task2();
}
interface Agenda3
{
    void task3();
}
class test implements Agenda1, Agenda2, Agenda3
{
   public void task1()
    {
        System.out.println("task1 done...");
    }
    public void task2()
    {
        System.out.println("task2 done...");
    }
    public void task3()
    {
        System.out.println("task3 done...");
    }
    public static void main(String[] args) 
    {
        test obj=new test();
        obj.task1();
        obj.task2();
        obj.task3();   
    }
}
