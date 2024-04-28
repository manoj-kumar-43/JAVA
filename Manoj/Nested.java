import java.util.*;
class Nested
{
    public static void main(String[] arg)
    {
        System.out.println("enter the score of 3 team");
        Scanner sc = new Scanner(System.in);
        int Aus = sc.nextInt();
        int Ind = sc.nextInt();
        int SL = sc.nextInt();
        
        if(Ind>Aus)
        {
            if(Ind>SL)
            {
                System.out.println("India score is high");
            }
            else
            {
                System.out.println("Aus score is high");
            }
        }
        else if(SL>Aus)
        {
            System.out.println("SL score is high");
        }
        else
        {
            System.out.println("Aus score is high");
        }
    }
}
