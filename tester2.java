class threaddemo extends Thread
{
    public threaddemo(String name)
    {
        super(name);
    }
    public void run()
    {
       int i=1;
       while(true)
       {
        System.out.println(i++);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
       }
}
public class tester2
{
    public static void main(String args[])
    {
        threaddemo t=new threaddemo("divakar");
        t.start();
        t.interrupt();
    }
}
