class Student
{
    int roll=10;                  //Create
}
class Test
{
    public static void main(String[] args) 
    {
        Student obj=new Student();
        System.out.println(obj.roll);                 //Read
        obj.roll=66;                                  //Update
        System.out.println("after update"+obj.roll);     
    }
}