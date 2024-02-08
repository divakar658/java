class mine
{
    public static int area(int l,int  b)
    {
        try
        {
            return l/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("zero division error"+e);
        }
        
    }
    public static void main(String[] args) {
        System.out.println(area(6,3));
    }
}
