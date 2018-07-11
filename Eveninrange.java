import java.util.*;
class Eveninrange
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        if(n<=100000 && q<=100000)
        {
        for(int i=n+1;i<q;i++)
        {
            if((i%2==0)&&i!=1)
            {
                System.out.println(i);
            }
        }
        }
    }
}
