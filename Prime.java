import java.util.*;
class Prime
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int flag=0;
        if(num<=1000)
        {
            if(num==1)
            {
                flag=1;
            }
            if(num==2)
            {
                flag=1;
            }
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
    }
}
