import java.util.*;
class Repeatednum
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        String s="";
        String str="";
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((a[i]==a[j])&&(i!=j)&&!s.contains(String.valueOf(a[i])))
                {
                    s=s+String.valueOf(a[i]);
                }
            }
        }
        if(s.length()>0)
        {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++)
        {
            str=str+" "+ch[i];
        }
        System.out.print(str.trim());
        }
        else
        {
            System.out.print("UNIQUE");
        }
    }
}
