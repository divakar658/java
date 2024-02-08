class day4
{
    static void fun(int n,int sum)
    {
        if(n<1)
        {
            System.out.println(sum);
            return;
        }
       
        else
        {
            fun(n-1,sum+n);
           
        }
    }
    public static void main(String args[])
    {
        fun(5,0);
    }
}