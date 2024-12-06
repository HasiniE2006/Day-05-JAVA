import java.util.*;
public class CharPattren1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}