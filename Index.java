import java.util.*;
class Index
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        String s="";
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i==a[i])
            {
                s=s+""+a[i];
            }
        }
        if(s.length()!=0)
        {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        s="";
        for(int i=0;i<ch.length;i++)
        {
            s=s+" "+ch[i];
        }
        System.out.print(s.trim());
        }
        else
        {
            System.out.print("-1");
        }
    }
}
