import java.util.*;
class Reverses
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s[]=str.split(" ");
        String a="";
        for(int i=0;i<s.length;i++)
        {
            StringBuffer sb=new StringBuffer(s[i]);
            a=a+" "+sb.reverse();
        }
        System.out.print(a.trim());
    }
}
