public class table
{
    public static void main(String args[])
    {
        int n;
        System.out.println("enter what table you want");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<=12;i++)
        {
            System.out.printf("%d * %d= %d",n,i,n*i);
        }
    }
}
