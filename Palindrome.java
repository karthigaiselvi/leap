import java.util.*;
class Palindrome
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=1000)
        {
            String s=String.valueOf(num);
            StringBuffer sb=new StringBuffer(s);
            String s1=String.valueOf(sb.reverse());
            if(s1.equalsIgnoreCase(s))
            {
                System.out.print("YES");
            }
            else
            {
             System.out.print("NO");   
            }
        }
    }
}
