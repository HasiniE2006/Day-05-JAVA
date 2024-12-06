public class CountBits {
    public static void main(String args[])
    {
        int a=18;
        int p=10;
        int count=0;
        while(p>=0)
        {
            if((a&(1<<p))!=0)
            {
            count++;
            }
            p--;
        }
        System.out.println(count);
}
} 



