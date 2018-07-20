import java.util.*;
class ReverseG
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        while(n>0)
        {
            temp=n%10;
            n=n/10;
            System.out.print(temp);
        }
    }
}
