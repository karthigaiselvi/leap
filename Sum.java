import java.util.*;
class Sum
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n>0)
        {
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        }
        System.out.print(sum);
    }
}
