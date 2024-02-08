public class F 
{

    /**
     * @param args the command line arguments
     */
static int f(int n)
{
    if(n==0 ||n==1)
    return 1;
    return n*f(n-1);
}
    public static void main(String[] args) 
    {
        // TODO code application logic here
         F obj=new F();
         int ans=obj.f(5);
         System.out.println(ans);

    }
    
}
