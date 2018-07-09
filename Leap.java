import java.util.*;
class Leap
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        {
            if(n%4==0)
            {
                System.out.print("yes");
            }
            else
            {
                System.out.print("no");
            }
        }
    }
}
