class printer
{
   synchronized void data(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
    }

}
class mythread1 extends Thread
{
    printer p;
    public mythread1(printer p)
    {
        this.p=p;
    }
    public void run()
    {
        p.data("striver");
    }
}
class mythread2 extends Thread
{
    printer p;
    public mythread2(printer p)
    {
        this.p=p;
    }
    public void run()
    {
        p.data("abdul");
    }
}
public class day6
{
    public static void main(String args[])
    {
        printer print=new printer();
        mythread1 t1=new mythread1(print);
        mythread2 t2=new mythread2(print);
        t1.start();
        t2.start();

    }
}

