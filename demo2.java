interface demo
{
    void display();

}
class uselambda
{
     void meth2(demo d)
    {
         
         d.display();
    }
}
class calllambda
{
    void meth3()
    {
    uselambda u=new uselambda();
    u.meth2(()->{System.out.println("hello world");});}
}
class demo2
{
    public static void main(String args[])
    {
     calllambda c=new calllambda();
     c.meth3();
    }
}