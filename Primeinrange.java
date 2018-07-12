import java.util.*;
class Primeinrange
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int flag=0;
        String s="";
        for(int i=a+1;i<b;i++)
        {flag=0;
            for(int j=2;j<i;j++)
            {
                if(i==1)
                {
                    flag=1;break;
                }
                if(i==2)
                {
                    flag=0;break;
                }
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                 s=s+""+i;
            }
        }
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        s="";
        for(int i=0;i<ch.length;i++)
        {
            s=s+" "+ch[i];
        }
        System.out.print(s.trim());
    }
}
