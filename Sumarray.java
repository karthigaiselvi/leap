import java.util.*;
class Sumarray
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[N];
        int sum=0;
        for(int i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<k;j++)
        {
            sum=sum+a[j];
        }
        System.out.print(sum);
    }
}
