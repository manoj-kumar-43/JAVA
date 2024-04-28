import java.util.*;
class calculator
{
    public static void main(String[] arg)
    {
        int n1,n2,ch,cal;
        System.out.println("Enter two Numbers");
        Scanner sc = new Scanner(System.in);
        n1 =sc.nextInt();
        n2 =sc.nextInt();
        
        ch=sc.nextInt();

        if(ch==1)
        {
            cal=n1+n2;
            System.out.println("ADDITION "+cal); 
        } 
        else if(ch==2)
        {
            cal=n1-n2;
            System.out.println("SUBSTRACTION " +cal);
        }
        else if(ch==3)
        {
            cal=n1*n2;
            System.out.println("MULTIPLICATION " +cal);
        }
        else if(ch==4)
        {
            cal=n1/n2;
            System.out.println("DIVISION " +cal);
        }
        else
        {
            cal=n1%n2;
            System.out.println("REMAINDER " +cal);
        }
    }
}