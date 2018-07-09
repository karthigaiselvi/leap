import java.util.*;
class Numberofdigit
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;int temp=0;
        if(n>0)
        {
            while(n!=0)
            {
                temp=n%10;
                count++;
                n=n/10;
            }
            System.out.print(count);
        }
        else
        {
            System.out.print(count);
        }
    }
}
