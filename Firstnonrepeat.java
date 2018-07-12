import java.util.*;
class Firstnonrepeat
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int flag=0;
        String s="";
        for(int i=0;i<n;i++)
        {flag=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                     s=s+""+a[i];
                }
            }
            
        }
        if(s.length()==0)
        {
            System.out.print("unique");
        }
        else
        {
         System.out.print(s.charAt(0));   
        }
    }
}
