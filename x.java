class x
{
    int a=10;
    class y
    {
        void display(String name)
        {
            System.out.println("hello mr"+name);
            System.out.println(a);
        }
    }
     void caller()
    {
        y obj=new y();
        obj.display("divakar");
    }
   
}
class tester
{
    public static void main(String args[])
    {
        x obj1=new x();
        obj1.caller();
    }
   
}