import java.util.*;
class Reverse
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer sb=new StringBuffer(str);
        System.out.print(sb.reverse());
    }
}
