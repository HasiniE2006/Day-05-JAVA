import java.util.*;
public class Reverse
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();
        while(n!=0)
        {
        int a=sc.nextInt();
        int dig,rev=0;
        while(a!=0)
        {
        dig=a%10;
        rev=rev*10+dig;
        a/=10;
 }
 System.out.println(rev);
}
            
}

}